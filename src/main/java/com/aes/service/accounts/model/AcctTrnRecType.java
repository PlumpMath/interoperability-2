
package com.aes.service.accounts.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcctTrnRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctTrnRec_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.aes.com/xs/modelo}AcctTrnInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcctTrnRec_Type", propOrder = {
    "acctTrnInfo"
})
public class AcctTrnRecType {

    @XmlElement(name = "AcctTrnInfo", required = true)
    protected AcctTrnInfoType acctTrnInfo;

    /**
     * Gets the value of the acctTrnInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AcctTrnInfoType }
     *     
     */
    public AcctTrnInfoType getAcctTrnInfo() {
        return acctTrnInfo;
    }

    /**
     * Sets the value of the acctTrnInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctTrnInfoType }
     *     
     */
    public void setAcctTrnInfo(AcctTrnInfoType value) {
        this.acctTrnInfo = value;
    }

}
