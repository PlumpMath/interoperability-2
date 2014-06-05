
package com.aes.service.accounts.fraudquery;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardStatusInqRq_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardStatusInqRq_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RqUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MsgRqHdr" type="{http://www.aes.com/xs/modelo}MsgRqHdr_Type" minOccurs="0"/>
 *         &lt;element name="CardSel" type="{http://www.aes.com/xs/modelo}ArrayOfCardKeys_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardStatusInqRq_Type", propOrder = {
    "rqUID",
    "msgRqHdr",
    "cardSel"
})
public class CardStatusInqRqType {

    @XmlElement(name = "RqUID")
    protected String rqUID;
    @XmlElement(name = "MsgRqHdr")
    protected MsgRqHdrType msgRqHdr;
    @XmlElement(name = "CardSel")
    protected ArrayOfCardKeysType cardSel;

    /**
     * Gets the value of the rqUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRqUID() {
        return rqUID;
    }

    /**
     * Sets the value of the rqUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRqUID(String value) {
        this.rqUID = value;
    }

    /**
     * Gets the value of the msgRqHdr property.
     * 
     * @return
     *     possible object is
     *     {@link MsgRqHdrType }
     *     
     */
    public MsgRqHdrType getMsgRqHdr() {
        return msgRqHdr;
    }

    /**
     * Sets the value of the msgRqHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgRqHdrType }
     *     
     */
    public void setMsgRqHdr(MsgRqHdrType value) {
        this.msgRqHdr = value;
    }

    /**
     * Gets the value of the cardSel property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCardKeysType }
     *     
     */
    public ArrayOfCardKeysType getCardSel() {
        return cardSel;
    }

    /**
     * Sets the value of the cardSel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCardKeysType }
     *     
     */
    public void setCardSel(ArrayOfCardKeysType value) {
        this.cardSel = value;
    }

}
