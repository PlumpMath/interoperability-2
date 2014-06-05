
package com.aes.service.accounts.xxx;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchPackageResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchPackageResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ErrorMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XMLResultFields" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchPackageResult", propOrder = {
    "errorMsg",
    "xmlResultFields"
})
public class SearchPackageResult {

    @XmlElementRef(name = "ErrorMsg", namespace = "http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", type = JAXBElement.class)
    protected JAXBElement<String> errorMsg;
    @XmlElementRef(name = "XMLResultFields", namespace = "http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", type = JAXBElement.class)
    protected JAXBElement<String> xmlResultFields;

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
     * Gets the value of the xmlResultFields property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getXMLResultFields() {
        return xmlResultFields;
    }

    /**
     * Sets the value of the xmlResultFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setXMLResultFields(JAXBElement<String> value) {
        this.xmlResultFields = ((JAXBElement<String> ) value);
    }

}
