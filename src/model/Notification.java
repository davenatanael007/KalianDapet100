/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author ACER
 */
public class Notification {

    private User idUser;
    private String message;
    private String status;
    private LocalDate date;

    public Notification(User idUser, String message, String status, LocalDate date) {
        this.idUser = idUser;
        this.message = message;
        this.status = status;
        this.date = date;
    }
    public Notification() {
        this.idUser = null;
        this.message = "";
        this.status = "";
        this.date = LocalDate.now();
    }
    /**
     * @return the idUser
     */
    public User getIdUser() {
        return idUser;
    }

    /**
     * @param idUser the idUser to set
     */
    public void setIdUser(User idUser) {
        this.idUser = idUser;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the date
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }
    
    
    
}
