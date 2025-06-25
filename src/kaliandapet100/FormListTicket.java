/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package kaliandapet100;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.User;
import com.flashsale.services.FlashsaleWebService;
import com.flashsale.services.LoginWebService;
import com.flashsale.services.Ticket;

public class FormListTicket extends javax.swing.JFrame {

    private User user;
    private ArrayList<Ticket> tickets = new ArrayList<>();
    private DefaultTableModel tableModel;
    String keyword;
    private java.util.HashMap<String, Integer> flashSaleTimers = new java.util.HashMap<>();
    private javax.swing.Timer countdownTimer;

    public FormListTicket(User user) {
        this.user = user;
        initComponents();
        this.keyword = txtSearch.getText();
        setupTable();
        loadTickets(keyword);
        setLocationRelativeTo(null);    }

    private void setupTable() {
        // Set title column
        String[] columns = {"ID", "Title", "Is Flashsale", "Price", "Stock", "Action"};
        tableModel = new DefaultTableModel(columns, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return column == 5; // Set action button as the only column that are editable
            }
        };
        jTableDisplay.setModel(tableModel);

        // Set row height
        jTableDisplay.setRowHeight(35);

        // Setup button renderer for action column
        jTableDisplay.getColumnModel().getColumn(5).setCellRenderer(new ButtonRenderer());
        jTableDisplay.getColumnModel().getColumn(5).setCellEditor(new ButtonEditor());

        // Set column widths
        jTableDisplay.getColumnModel().getColumn(0).setPreferredWidth(50);
        jTableDisplay.getColumnModel().getColumn(1).setPreferredWidth(170);
        jTableDisplay.getColumnModel().getColumn(2).setPreferredWidth(100); // FlashSale Status
        jTableDisplay.getColumnModel().getColumn(3).setPreferredWidth(150);
        jTableDisplay.getColumnModel().getColumn(4).setPreferredWidth(80);
        jTableDisplay.getColumnModel().getColumn(5).setPreferredWidth(80);

        // Center align table cells
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(javax.swing.JLabel.CENTER);

        for (int i = 0; i < jTableDisplay.getColumnCount() - 1; i++) { // Exclude action column
            jTableDisplay.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }

    private String formatSecondsToHHMMSS(int totalSeconds) {
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    private void startCountdownTimer() {
        if (countdownTimer != null && countdownTimer.isRunning()) {
            countdownTimer.stop(); // Stop timer lama kalau ada
        }

        countdownTimer = new javax.swing.Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < tableModel.getRowCount(); i++) {
                    String ticketId = (String) tableModel.getValueAt(i, 0);
                    String status = (String) tableModel.getValueAt(i, 2);

//                    if ("FlashSale".equals(status)) {
//                        Integer timeLeft = flashSaleTimers.get(ticketId);
//                        if (timeLeft != null) {
//                            if (timeLeft > 0) {
//                                timeLeft--;
//                                flashSaleTimers.put(ticketId, timeLeft);
//                                tableModel.setValueAt(formatSecondsToHHMMSS(timeLeft), i, 3); // Update timer
//                            } else {
//                                // Kalau waktu habis
//                                tableModel.setValueAt("Expired", i, 3);
//                                tableModel.setValueAt("Normal", i, 2); // Update status
//                            }
//                        }
//                    }
                }
            }
        });

        countdownTimer.start();
    }

    private void loadTickets(String keyword) {
        try {
            if (keyword == null || keyword.trim().isEmpty()) {
                tickets = (ArrayList<Ticket>) viewListTicket();
            } else {
                tickets = (ArrayList<Ticket>) searchTicket(keyword);
            }

            // Clear table
            tableModel.setRowCount(0);

            // Clear flashSaleTimers
            flashSaleTimers.clear();

            // Format harga
            NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));

            for (Ticket ticket : tickets) {
                String priceFormatted = currencyFormat.format(ticket.getPrice());
                String shortDesc = ticket.getDesc();
                if (shortDesc.length() > 20) {
                    shortDesc = shortDesc.substring(0, 20) + "...";
                }

                String flashSaleStatus = "Normal";
                String flashSaleTimer = "-";

                if (ticket.isIsFlashSale()==true) {
                    flashSaleStatus = "FlashSale";
//                    if (ticket.getTimer() != null) {
//                        long secondsRemaining = java.time.Duration.between(java.time.LocalDateTime.now(), ticket.getTimer()).getSeconds();
//                        if (secondsRemaining > 0) {
//                            flashSaleTimers.put(ticket.getId(), (int) secondsRemaining);
//                            flashSaleTimer = formatSecondsToHHMMSS((int) secondsRemaining);
//                        } else {
//                            flashSaleTimer = "Expired";
//                        }
//                    }
                }

                tableModel.addRow(new Object[]{
                    ticket.getId(),
                    ticket.getTitle(),
                    flashSaleStatus,
                    flashSaleTimer,
                    ticket.getStock(),
                    "Details"
                });
            }

            startCountdownTimer();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }

    // Custom Button Renderer
    class ButtonRenderer extends DefaultTableCellRenderer {

        private JButton button;

        public ButtonRenderer() {
            button = new JButton("Details");
            button.setBackground(new java.awt.Color(228, 123, 46));
            button.setForeground(new java.awt.Color(255, 249, 240));
            button.setFont(new java.awt.Font("Segoe UI", 1, 12));
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            return button;
        }
    }

    // Custom Button Editor
    class ButtonEditor extends javax.swing.DefaultCellEditor {

        private JButton button;
        private boolean isPushed;

        public ButtonEditor() {
            super(new javax.swing.JTextField());
            button = new JButton("Details");
            button.setBackground(new java.awt.Color(228, 123, 46));
            button.setForeground(new java.awt.Color(255, 249, 240));
            button.setFont(new java.awt.Font("Segoe UI", 1, 12));

            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    fireEditingStopped();
                }
            });
        }

        @Override
        public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
            isPushed = true;
            return button;
        }

        @Override
        public Object getCellEditorValue() {
            if (isPushed) {
                int selectedRow = jTableDisplay.getSelectedRow();
                if (selectedRow >= 0) {
                    try {
                        String ticketIdClicked = (String) jTableDisplay.getValueAt(selectedRow, 0);

                        // --- PENTING: Panggil Web Service untuk mendapatkan detail tiket terbaru ---
                        // Ini akan mengembalikan com.flashsale.services.Ticket
                        Ticket selectedTicket = getTicketByID(ticketIdClicked);

                        for (Ticket ticket : tickets) {
                            if (ticket.getId().equals(ticketIdClicked)) {
                                selectedTicket = ticket;
                                break;
                            }
                        }

                        if (selectedTicket != null) {
                            FormTicketDetails detailsForm = new FormTicketDetails(selectedTicket, user);
                            detailsForm.setVisible(true);
                        } else {
                            JOptionPane.showMessageDialog(null, "Ticket tidak ditemukan.", "Error", JOptionPane.ERROR_MESSAGE);
                        }

                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Error fetching ticket: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                        ex.printStackTrace();
                    }
                }
            }
            isPushed = false;
            return "Details";
        }

        @Override
        public boolean stopCellEditing() {
            isPushed = false;
            return super.stopCellEditing();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDisplay = new javax.swing.JTable();
        txtSearch = new java.awt.TextField();
        btnSearch = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(200, 169, 139));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(74, 52, 46));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setPreferredSize(new java.awt.Dimension(450, 350));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(245, 232, 212));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pick Your Ticket!");
        jLabel1.setPreferredSize(new java.awt.Dimension(100, 25));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 155, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setOpaque(true);
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 485, 4));

        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 1204, 130, -1));

        jTableDisplay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableDisplay);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 510, 330));

        txtSearch.setBackground(new java.awt.Color(245, 232, 212));
        txtSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtSearch.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtSearch.setForeground(new java.awt.Color(74, 52, 46));
        jPanel2.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 390, 30));

        btnSearch.setBackground(new java.awt.Color(228, 123, 46));
        btnSearch.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel2.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 100, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 530, 450));

        jButton2.setBackground(new java.awt.Color(255, 51, 51));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 249, 240));
        jButton2.setText("<");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 30, 30, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String keyword = txtSearch.getText().trim();
        loadTickets(keyword);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        User loggedInUser = new User();
        FormMenu formMenu = new FormMenu(loggedInUser);
        formMenu.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    private void jButtonRefreshActionPerformed(java.awt.event.ActionEvent evt) {
        loadTickets(keyword);
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormListTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDisplay;
    private java.awt.TextField txtSearch;
    // End of variables declaration//GEN-END:variables

    private static java.util.List<com.flashsale.services.Ticket> viewListTicket() {
        com.flashsale.services.LoginWebService service = new com.flashsale.services.LoginWebService();
        com.flashsale.services.FlashsaleWebService port = service.getFlashsaleWebServicePort();
        return port.viewListTicket();
    }

    private static java.util.List<com.flashsale.services.Ticket> searchTicket(java.lang.String keyword) {
        com.flashsale.services.LoginWebService service = new com.flashsale.services.LoginWebService();
        com.flashsale.services.FlashsaleWebService port = service.getFlashsaleWebServicePort();
        return port.searchTicket(keyword);
    }

    private static Ticket getTicketByID(java.lang.String id) {
        com.flashsale.services.LoginWebService service = new com.flashsale.services.LoginWebService();
        com.flashsale.services.FlashsaleWebService port = service.getFlashsaleWebServicePort();
        return port.getTicketByID(id);
    }
}
