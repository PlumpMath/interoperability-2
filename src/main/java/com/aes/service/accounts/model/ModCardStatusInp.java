
package com.aes.service.accounts.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.aes.com/xs/modelo}CardStatusModRq"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cardStatusModRq"
})
@XmlRootElement(name = "ModCardStatusInp")
public class ModCardStatusInp {

    @XmlElement(name = "CardStatusModRq", required = true)
    protected CardStatusModRqType cardStatusModRq;

    /**
     * Gets the value of the cardStatusModRq property.
     * 
     * @return
     *     possible object is
     *     {@link CardStatusModRqType }
     *     
     */
    public CardStatusModRqType getCardStatusModRq() {
        return cardStatusModRq;
    }

    /**
     * Sets the value of the cardStatusModRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardStatusModRqType }
     *     
     */
    public void setCardStatusModRq(CardStatusModRqType value) {
        this.cardStatusModRq = value;
    }

}
