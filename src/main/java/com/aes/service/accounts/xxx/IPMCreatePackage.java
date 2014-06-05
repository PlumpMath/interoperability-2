
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
 *         &lt;element name="createPackageRequest" type="{http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM}CreatePackageRequest" minOccurs="0"/>
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
    "createPackageRequest"
})
@XmlRootElement(name = "IPMCreatePackage", namespace = "http://tempuri.org/")
public class IPMCreatePackage {

    @XmlElementRef(name = "createPackageRequest", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<CreatePackageRequest> createPackageRequest;

    /**
     * Gets the value of the createPackageRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CreatePackageRequest }{@code >}
     *     
     */
    public JAXBElement<CreatePackageRequest> getCreatePackageRequest() {
        return createPackageRequest;
    }

    /**
     * Sets the value of the createPackageRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CreatePackageRequest }{@code >}
     *     
     */
    public void setCreatePackageRequest(JAXBElement<CreatePackageRequest> value) {
        this.createPackageRequest = ((JAXBElement<CreatePackageRequest> ) value);
    }

}
