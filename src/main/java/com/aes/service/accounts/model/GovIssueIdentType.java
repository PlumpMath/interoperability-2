
package com.aes.service.accounts.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GovIssueIdent_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GovIssueIdent_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.aes.com/xs/modelo}GovIssueIdentType"/>
 *         &lt;element ref="{http://www.aes.com/xs/modelo}IdentSerialNum"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GovIssueIdent_Type", propOrder = {
    "govIssueIdentType",
    "identSerialNum"
})
public class GovIssueIdentType {

    @XmlElement(name = "GovIssueIdentType", required = true)
    protected String govIssueIdentType;
    @XmlElement(name = "IdentSerialNum", required = true)
    protected String identSerialNum;

    /**
     * Gets the value of the govIssueIdentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGovIssueIdentType() {
        return govIssueIdentType;
    }

    /**
     * Sets the value of the govIssueIdentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGovIssueIdentType(String value) {
        this.govIssueIdentType = value;
    }

    /**
     * Gets the value of the identSerialNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentSerialNum() {
        return identSerialNum;
    }

    /**
     * Sets the value of the identSerialNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentSerialNum(String value) {
        this.identSerialNum = value;
    }

}
