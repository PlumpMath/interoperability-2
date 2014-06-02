
package com.aes.service.accounts.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustId_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustId_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.aes.com/xs/modelo}GovIssueIdent"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustId_Type", propOrder = {
    "govIssueIdent"
})
public class CustIdType {

    @XmlElement(name = "GovIssueIdent", required = true)
    protected GovIssueIdentType govIssueIdent;

    /**
     * Gets the value of the govIssueIdent property.
     * 
     * @return
     *     possible object is
     *     {@link GovIssueIdentType }
     *     
     */
    public GovIssueIdentType getGovIssueIdent() {
        return govIssueIdent;
    }

    /**
     * Sets the value of the govIssueIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link GovIssueIdentType }
     *     
     */
    public void setGovIssueIdent(GovIssueIdentType value) {
        this.govIssueIdent = value;
    }

}
