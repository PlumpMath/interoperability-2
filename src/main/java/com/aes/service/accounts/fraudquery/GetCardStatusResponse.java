
package com.aes.service.accounts.fraudquery;

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
 *         &lt;element name="getCardStatusResult" type="{http://www.aes.com/xs/modelo}GetCardStatusOut" minOccurs="0"/>
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
    "getCardStatusResult"
})
@XmlRootElement(name = "getCardStatusResponse", namespace = "http://com/aes/service/accounts/CardStatusInquiry")
public class GetCardStatusResponse {

    @XmlElement(namespace = "http://com/aes/service/accounts/CardStatusInquiry")
    protected GetCardStatusOut getCardStatusResult;

    /**
     * Gets the value of the getCardStatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetCardStatusOut }
     *     
     */
    public GetCardStatusOut getGetCardStatusResult() {
        return getCardStatusResult;
    }

    /**
     * Sets the value of the getCardStatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCardStatusOut }
     *     
     */
    public void setGetCardStatusResult(GetCardStatusOut value) {
        this.getCardStatusResult = value;
    }

}
