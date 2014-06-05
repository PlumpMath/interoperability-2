
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
 *         &lt;element name="getCardStatusRequest" type="{http://www.aes.com/xs/modelo}GetCardStatusInp" minOccurs="0"/>
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
    "getCardStatusRequest"
})
@XmlRootElement(name = "getCardStatus", namespace = "http://com/aes/service/accounts/CardStatusInquiry")
public class GetCardStatus {

    @XmlElement(namespace = "http://com/aes/service/accounts/CardStatusInquiry")
    protected GetCardStatusInp getCardStatusRequest;

    /**
     * Gets the value of the getCardStatusRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GetCardStatusInp }
     *     
     */
    public GetCardStatusInp getGetCardStatusRequest() {
        return getCardStatusRequest;
    }

    /**
     * Sets the value of the getCardStatusRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCardStatusInp }
     *     
     */
    public void setGetCardStatusRequest(GetCardStatusInp value) {
        this.getCardStatusRequest = value;
    }

}
