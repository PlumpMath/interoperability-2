
package com.aes.service.accounts.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardStatus_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardStatus_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.aes.com/xs/modelo}CardStatusCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.aes.com/xs/modelo}StatusDesc" minOccurs="0"/>
 *         &lt;element ref="{http://www.aes.com/xs/modelo}CardStatusAction" minOccurs="0"/>
 *         &lt;element ref="{http://www.aes.com/xs/modelo}StatusReason" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardStatus_Type", propOrder = {
    "cardStatusCode",
    "statusDesc",
    "cardStatusAction",
    "statusReason"
})
public class CardStatusType {

    @XmlElement(name = "CardStatusCode")
    protected String cardStatusCode;
    @XmlElement(name = "StatusDesc")
    protected String statusDesc;
    @XmlElement(name = "CardStatusAction")
    protected String cardStatusAction;
    @XmlElement(name = "StatusReason")
    protected String statusReason;

    /**
     * Gets the value of the cardStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardStatusCode() {
        return cardStatusCode;
    }

    /**
     * Sets the value of the cardStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardStatusCode(String value) {
        this.cardStatusCode = value;
    }

    /**
     * Gets the value of the statusDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDesc() {
        return statusDesc;
    }

    /**
     * Sets the value of the statusDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDesc(String value) {
        this.statusDesc = value;
    }

    /**
     * Gets the value of the cardStatusAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardStatusAction() {
        return cardStatusAction;
    }

    /**
     * Sets the value of the cardStatusAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardStatusAction(String value) {
        this.cardStatusAction = value;
    }

    /**
     * Gets the value of the statusReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusReason() {
        return statusReason;
    }

    /**
     * Sets the value of the statusReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusReason(String value) {
        this.statusReason = value;
    }

}
