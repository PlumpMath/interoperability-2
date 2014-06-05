
package com.aes.service.accounts.fraudquery;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCardStatusInp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCardStatusInp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CardStatusInqRq" type="{http://www.aes.com/xs/modelo}CardStatusInqRq_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCardStatusInp", propOrder = {
    "cardStatusInqRq"
})
public class GetCardStatusInp {

    @XmlElement(name = "CardStatusInqRq")
    protected CardStatusInqRqType cardStatusInqRq;

    /**
     * Gets the value of the cardStatusInqRq property.
     * 
     * @return
     *     possible object is
     *     {@link CardStatusInqRqType }
     *     
     */
    public CardStatusInqRqType getCardStatusInqRq() {
        return cardStatusInqRq;
    }

    /**
     * Sets the value of the cardStatusInqRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardStatusInqRqType }
     *     
     */
    public void setCardStatusInqRq(CardStatusInqRqType value) {
        this.cardStatusInqRq = value;
    }

}
