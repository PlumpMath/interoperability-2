
package com.aes.service.accounts.xxx;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ErrorMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExportResult" type="{http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM}ExportResult" minOccurs="0"/>
 *         &lt;element name="XMLResults" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchResult", propOrder = {
    "errorMsg",
    "exportResult",
    "xmlResults"
})
public class SearchResult {

    @XmlElementRef(name = "ErrorMsg", namespace = "http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", type = JAXBElement.class)
    protected JAXBElement<String> errorMsg;
    @XmlElementRef(name = "ExportResult", namespace = "http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", type = JAXBElement.class)
    protected JAXBElement<ExportResult> exportResult;
    @XmlElementRef(name = "XMLResults", namespace = "http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", type = JAXBElement.class)
    protected JAXBElement<String> xmlResults;

    /**
     * Gets the value of the errorMsg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getErrorMsg() {
        return errorMsg;
    }

    /**
     * Sets the value of the errorMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setErrorMsg(JAXBElement<String> value) {
        this.errorMsg = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the exportResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExportResult }{@code >}
     *     
     */
    public JAXBElement<ExportResult> getExportResult() {
        return exportResult;
    }

    /**
     * Sets the value of the exportResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExportResult }{@code >}
     *     
     */
    public void setExportResult(JAXBElement<ExportResult> value) {
        this.exportResult = ((JAXBElement<ExportResult> ) value);
    }

    /**
     * Gets the value of the xmlResults property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getXMLResults() {
        return xmlResults;
    }

    /**
     * Sets the value of the xmlResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setXMLResults(JAXBElement<String> value) {
        this.xmlResults = ((JAXBElement<String> ) value);
    }

}
