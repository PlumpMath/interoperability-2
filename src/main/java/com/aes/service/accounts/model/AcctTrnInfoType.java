
package com.aes.service.accounts.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcctTrnInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctTrnInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.aes.com/xs/modelo}AcctRec" minOccurs="0"/>
 *         &lt;element ref="{http://www.aes.com/xs/modelo}OrigDt" minOccurs="0"/>
 *         &lt;element ref="{http://www.aes.com/xs/modelo}TotalCurAmt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcctTrnInfo_Type", propOrder = {
    "acctRec",
    "origDt",
    "totalCurAmt"
})
public class AcctTrnInfoType {

    @XmlElement(name = "AcctRec")
    protected AcctRecType acctRec;
    @XmlElement(name = "OrigDt")
    protected String origDt;
    @XmlElement(name = "TotalCurAmt")
    protected TotalCurAmtType totalCurAmt;

    /**
     * Gets the value of the acctRec property.
     * 
     * @return
     *     possible object is
     *     {@link AcctRecType }
     *     
     */
    public AcctRecType getAcctRec() {
        return acctRec;
    }

    /**
     * Sets the value of the acctRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctRecType }
     *     
     */
    public void setAcctRec(AcctRecType value) {
        this.acctRec = value;
    }

    /**
     * Gets the value of the origDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigDt() {
        return origDt;
    }

    /**
     * Sets the value of the origDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigDt(String value) {
        this.origDt = value;
    }

    /**
     * Gets the value of the totalCurAmt property.
     * 
     * @return
     *     possible object is
     *     {@link TotalCurAmtType }
     *     
     */
    public TotalCurAmtType getTotalCurAmt() {
        return totalCurAmt;
    }

    /**
     * Sets the value of the totalCurAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalCurAmtType }
     *     
     */
    public void setTotalCurAmt(TotalCurAmtType value) {
        this.totalCurAmt = value;
    }

}
