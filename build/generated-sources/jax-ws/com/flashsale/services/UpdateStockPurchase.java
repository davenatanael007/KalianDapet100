
package com.flashsale.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateStockPurchase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateStockPurchase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ticket" type="{http://services.flashsale.com/}ticket" minOccurs="0"/&gt;
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateStockPurchase", propOrder = {
    "ticket",
    "quantity"
})
public class UpdateStockPurchase {

    protected Ticket ticket;
    protected int quantity;

    /**
     * Gets the value of the ticket property.
     * 
     * @return
     *     possible object is
     *     {@link Ticket }
     *     
     */
    public Ticket getTicket() {
        return ticket;
    }

    /**
     * Sets the value of the ticket property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ticket }
     *     
     */
    public void setTicket(Ticket value) {
        this.ticket = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     */
    public void setQuantity(int value) {
        this.quantity = value;
    }

}
