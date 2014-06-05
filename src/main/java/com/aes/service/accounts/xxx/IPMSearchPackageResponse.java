
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
 *         &lt;element name="IPMSearchPackageResult" type="{http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM}SearchPackageResult" minOccurs="0"/>
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
    "ipmSearchPackageResult"
})
@XmlRootElement(name = "IPMSearchPackageResponse", namespace = "http://tempuri.org/")
public class IPMSearchPackageResponse {

    @XmlElementRef(name = "IPMSearchPackageResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<SearchPackageResult> ipmSearchPackageResult;

    /**
     * Gets the value of the ipmSearchPackageResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SearchPackageResult }{@code >}
     *     
     */
    public JAXBElement<SearchPackageResult> getIPMSearchPackageResult() {
        return ipmSearchPackageResult;
    }

    /**
     * Sets the value of the ipmSearchPackageResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SearchPackageResult }{@code >}
     *     
     */
    public void setIPMSearchPackageResult(JAXBElement<SearchPackageResult> value) {
        this.ipmSearchPackageResult = ((JAXBElement<SearchPackageResult> ) value);
    }

}
