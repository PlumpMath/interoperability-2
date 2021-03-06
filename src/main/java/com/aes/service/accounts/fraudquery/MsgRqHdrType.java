
package com.aes.service.accounts.fraudquery;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MsgRqHdr_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MsgRqHdr_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContextRqHdr" type="{http://www.aes.com/xs/modelo}ContextRqHdr_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MsgRqHdr_Type", propOrder = {
    "contextRqHdr"
})
public class MsgRqHdrType {

    @XmlElement(name = "ContextRqHdr")
    protected ContextRqHdrType contextRqHdr;

    /**
     * Gets the value of the contextRqHdr property.
     * 
     * @return
     *     possible object is
     *     {@link ContextRqHdrType }
     *     
     */
    public ContextRqHdrType getContextRqHdr() {
        return contextRqHdr;
    }

    /**
     * Sets the value of the contextRqHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContextRqHdrType }
     *     
     */
    public void setContextRqHdr(ContextRqHdrType value) {
        this.contextRqHdr = value;
    }

}
