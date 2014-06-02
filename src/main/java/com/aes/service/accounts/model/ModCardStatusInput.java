
package com.aes.service.accounts.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModCardStatusInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModCardStatusInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.aes.com/xs/modelo}ModCardStatusInp"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModCardStatusInput", namespace = "http://com/aes/service/accounts/CardFraudulent", propOrder = {
    "modCardStatusInp"
})
public class ModCardStatusInput {

    @XmlElement(name = "ModCardStatusInp", namespace = "http://www.aes.com/xs/modelo", required = true)
    protected ModCardStatusInp modCardStatusInp;

    /**
     * Gets the value of the modCardStatusInp property.
     * 
     * @return
     *     possible object is
     *     {@link ModCardStatusInp }
     *     
     */
    public ModCardStatusInp getModCardStatusInp() {
        return modCardStatusInp;
    }

    /**
     * Sets the value of the modCardStatusInp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModCardStatusInp }
     *     
     */
    public void setModCardStatusInp(ModCardStatusInp value) {
        this.modCardStatusInp = value;
    }

}
