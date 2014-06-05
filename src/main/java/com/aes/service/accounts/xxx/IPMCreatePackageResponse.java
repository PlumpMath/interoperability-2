
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
 *         &lt;element name="IPMCreatePackageResult" type="{http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM}CreatePackageResult" minOccurs="0"/>
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
    "ipmCreatePackageResult"
})
@XmlRootElement(name = "IPMCreatePackageResponse", namespace = "http://tempuri.org/")
public class IPMCreatePackageResponse {

    @XmlElementRef(name = "IPMCreatePackageResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<CreatePackageResult> ipmCreatePackageResult;

    /**
     * Gets the value of the ipmCreatePackageResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CreatePackageResult }{@code >}
     *     
     */
    public JAXBElement<CreatePackageResult> getIPMCreatePackageResult() {
        return ipmCreatePackageResult;
    }

    /**
     * Sets the value of the ipmCreatePackageResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CreatePackageResult }{@code >}
     *     
     */
    public void setIPMCreatePackageResult(JAXBElement<CreatePackageResult> value) {
        this.ipmCreatePackageResult = ((JAXBElement<CreatePackageResult> ) value);
    }

}
