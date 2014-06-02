
package com.aes.service.accounts.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcctTrnSel_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctTrnSel_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.aes.com/xs/modelo}DtRange"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcctTrnSel_Type", propOrder = {
    "dtRange"
})
public class AcctTrnSelType {

    @XmlElement(name = "DtRange", required = true)
    protected DtRangeType dtRange;

    /**
     * Gets the value of the dtRange property.
     * 
     * @return
     *     possible object is
     *     {@link DtRangeType }
     *     
     */
    public DtRangeType getDtRange() {
        return dtRange;
    }

    /**
     * Sets the value of the dtRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link DtRangeType }
     *     
     */
    public void setDtRange(DtRangeType value) {
        this.dtRange = value;
    }

}
