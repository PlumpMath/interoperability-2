
package com.aes.service.accounts.xxx;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="IPMSearchResult" type="{http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM}SearchResult" minOccurs="0"/>
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
    "ipmSearchResult"
})
@XmlRootElement(name = "IPMSearchResponse", namespace = "http://tempuri.org/")
public class IPMSearchResponse {

    @XmlElementRef(name = "IPMSearchResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<SearchResult> ipmSearchResult;

    /**
     * Gets the value of the ipmSearchResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SearchResult }{@code >}
     *     
     */
    public JAXBElement<SearchResult> getIPMSearchResult() {
        return ipmSearchResult;
    }

    /**
     * Sets the value of the ipmSearchResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SearchResult }{@code >}
     *     
     */
    public void setIPMSearchResult(JAXBElement<SearchResult> value) {
        this.ipmSearchResult = ((JAXBElement<SearchResult> ) value);
    }

}
