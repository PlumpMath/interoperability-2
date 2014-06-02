
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
 *         &lt;element ref="{http://www.aes.com/xs/modelo}CardStatusModRs"/>
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
    "cardStatusModRs"
})
@XmlRootElement(name = "ModCardStatusOut")
public class ModCardStatusOut {

    @XmlElement(name = "CardStatusModRs", required = true)
    protected CardStatusModRsType cardStatusModRs;

    /**
     * Gets the value of the cardStatusModRs property.
     * 
     * @return
     *     possible object is
     *     {@link CardStatusModRsType }
     *     
     */
    public CardStatusModRsType getCardStatusModRs() {
        return cardStatusModRs;
    }

    /**
     * Sets the value of the cardStatusModRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardStatusModRsType }
     *     
     */
    public void setCardStatusModRs(CardStatusModRsType value) {
        this.cardStatusModRs = value;
    }

}
