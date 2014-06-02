
package com.aes.service.accounts.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModCardStatusOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModCardStatusOutput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.aes.com/xs/modelo}ModCardStatusOut"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModCardStatusOutput", namespace = "http://com/aes/service/accounts/CardFraudulent", propOrder = {
    "modCardStatusOut"
})
public class ModCardStatusOutput {

    @XmlElement(name = "ModCardStatusOut", namespace = "http://www.aes.com/xs/modelo", required = true)
    protected ModCardStatusOut modCardStatusOut;

    /**
     * Gets the value of the modCardStatusOut property.
     * 
     * @return
     *     possible object is
     *     {@link ModCardStatusOut }
     *     
     */
    public ModCardStatusOut getModCardStatusOut() {
        return modCardStatusOut;
    }

    /**
     * Sets the value of the modCardStatusOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModCardStatusOut }
     *     
     */
    public void setModCardStatusOut(ModCardStatusOut value) {
        this.modCardStatusOut = value;
    }

}
