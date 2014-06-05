
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
 *         &lt;element name="exportRequest" type="{http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM}ExportRequest" minOccurs="0"/>
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
    "exportRequest"
})
@XmlRootElement(name = "IPMExport", namespace = "http://tempuri.org/")
public class IPMExport {

    @XmlElementRef(name = "exportRequest", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ExportRequest> exportRequest;

    /**
     * Gets the value of the exportRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExportRequest }{@code >}
     *     
     */
    public JAXBElement<ExportRequest> getExportRequest() {
        return exportRequest;
    }

    /**
     * Sets the value of the exportRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExportRequest }{@code >}
     *     
     */
    public void setExportRequest(JAXBElement<ExportRequest> value) {
        this.exportRequest = ((JAXBElement<ExportRequest> ) value);
    }

}
