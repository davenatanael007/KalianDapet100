
package com.flashsale.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ticket complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ticket"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://services.flashsale.com/}myModel"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="createdDate" type="{http://services.flashsale.com/}localDate" minOccurs="0"/&gt;
 *         &lt;element name="creator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="imagePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isFlashSale" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="stock" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="updatedDate" type="{http://services.flashsale.com/}localDate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ticket", propOrder = {
    "createdDate",
    "creator",
    "desc",
    "id",
    "imagePath",
    "isFlashSale",
    "price",
    "stock",
    "title",
    "updatedDate"
})
public class Ticket
    extends MyModel
{

    protected LocalDate createdDate;
    protected String creator;
    protected String desc;
    protected String id;
    protected String imagePath;
    protected Boolean isFlashSale;
    protected int price;
    protected int stock;
    protected String title;
    protected LocalDate updatedDate;

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link LocalDate }
     *     
     */
    public LocalDate getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalDate }
     *     
     */
    public void setCreatedDate(LocalDate value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the creator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreator() {
        return creator;
    }

    /**
     * Sets the value of the creator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreator(String value) {
        this.creator = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the imagePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImagePath() {
        return imagePath;
    }

    /**
     * Sets the value of the imagePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImagePath(String value) {
        this.imagePath = value;
    }

    /**
     * Gets the value of the isFlashSale property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFlashSale() {
        return isFlashSale;
    }

    /**
     * Sets the value of the isFlashSale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFlashSale(Boolean value) {
        this.isFlashSale = value;
    }

    /**
     * Gets the value of the price property.
     * 
     */
    public int getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     */
    public void setPrice(int value) {
        this.price = value;
    }

    /**
     * Gets the value of the stock property.
     * 
     */
    public int getStock() {
        return stock;
    }

    /**
     * Sets the value of the stock property.
     * 
     */
    public void setStock(int value) {
        this.stock = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the updatedDate property.
     * 
     * @return
     *     possible object is
     *     {@link LocalDate }
     *     
     */
    public LocalDate getUpdatedDate() {
        return updatedDate;
    }

    /**
     * Sets the value of the updatedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalDate }
     *     
     */
    public void setUpdatedDate(LocalDate value) {
        this.updatedDate = value;
    }

}
