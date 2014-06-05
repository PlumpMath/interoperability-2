
package com.aes.service.accounts.xxx;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchPackageRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchPackageRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Template" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XMLFieldValues" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchPackageRequest", propOrder = {
    "template",
    "xmlFieldValues"
})
public class SearchPackageRequest {

    @XmlElementRef(name = "Template", namespace = "http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", type = JAXBElement.class)
    protected JAXBElement<String> template;
    @XmlElementRef(name = "XMLFieldValues", namespace = "http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", type = JAXBElement.class)
    protected JAXBElement<String> xmlFieldValues;

    /**
     * Gets the value of the template property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTemplate() {
        return template;
    }

    /**
     * Sets the value of the template property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTemplate(JAXBElement<String> value) {
        this.template = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the xmlFieldValues property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getXMLFieldValues() {
        return xmlFieldValues;
    }

    /**
     * Sets the value of the xmlFieldValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setXMLFieldValues(JAXBElement<String> value) {
        this.xmlFieldValues = ((JAXBElement<String> ) value);
    }

}
