
package com.aes.service.accounts.xxx;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreatePackageRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreatePackageRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Event" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FieldValues" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartEvent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Template" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreatePackageRequest", propOrder = {
    "event",
    "fieldValues",
    "startEvent",
    "template"
})
public class CreatePackageRequest {

    @XmlElementRef(name = "Event", namespace = "http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", type = JAXBElement.class)
    protected JAXBElement<String> event;
    @XmlElementRef(name = "FieldValues", namespace = "http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", type = JAXBElement.class)
    protected JAXBElement<String> fieldValues;
    @XmlElementRef(name = "StartEvent", namespace = "http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", type = JAXBElement.class)
    protected JAXBElement<String> startEvent;
    @XmlElementRef(name = "Template", namespace = "http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", type = JAXBElement.class)
    protected JAXBElement<String> template;

    /**
     * Gets the value of the event property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvent() {
        return event;
    }

    /**
     * Sets the value of the event property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvent(JAXBElement<String> value) {
        this.event = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fieldValues property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFieldValues() {
        return fieldValues;
    }

    /**
     * Sets the value of the fieldValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFieldValues(JAXBElement<String> value) {
        this.fieldValues = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the startEvent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStartEvent() {
        return startEvent;
    }

    /**
     * Sets the value of the startEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStartEvent(JAXBElement<String> value) {
        this.startEvent = ((JAXBElement<String> ) value);
    }

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

}
