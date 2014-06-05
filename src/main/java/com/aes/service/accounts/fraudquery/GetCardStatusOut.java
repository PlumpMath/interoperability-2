
package com.aes.service.accounts.fraudquery;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCardStatusOut complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCardStatusOut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CardStatusInqRs" type="{http://www.aes.com/xs/modelo}CardStatusInqRs_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCardStatusOut", propOrder = {
    "cardStatusInqRs"
})
public class GetCardStatusOut {

    @XmlElement(name = "CardStatusInqRs")
    protected CardStatusInqRsType cardStatusInqRs;

    /**
     * Gets the value of the cardStatusInqRs property.
     * 
     * @return
     *     possible object is
     *     {@link CardStatusInqRsType }
     *     
     */
    public CardStatusInqRsType getCardStatusInqRs() {
        return cardStatusInqRs;
    }

    /**
     * Sets the value of the cardStatusInqRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardStatusInqRsType }
     *     
     */
    public void setCardStatusInqRs(CardStatusInqRsType value) {
        this.cardStatusInqRs = value;
    }

}
