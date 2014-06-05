
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
 *         &lt;element name="IPMExportResult" type="{http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM}ExportResult" minOccurs="0"/>
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
    "ipmExportResult"
})
@XmlRootElement(name = "IPMExportResponse", namespace = "http://tempuri.org/")
public class IPMExportResponse {

    @XmlElementRef(name = "IPMExportResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ExportResult> ipmExportResult;

    /**
     * Gets the value of the ipmExportResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExportResult }{@code >}
     *     
     */
    public JAXBElement<ExportResult> getIPMExportResult() {
        return ipmExportResult;
    }

    /**
     * Sets the value of the ipmExportResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExportResult }{@code >}
     *     
     */
    public void setIPMExportResult(JAXBElement<ExportResult> value) {
        this.ipmExportResult = ((JAXBElement<ExportResult> ) value);
    }

}
