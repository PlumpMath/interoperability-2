
package com.aes.service.accounts.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardStatusModRq_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardStatusModRq_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.aes.com/xs/modelo}RqUID"/>
 *         &lt;element ref="{http://www.aes.com/xs/modelo}MsgRqHdr"/>
 *         &lt;element ref="{http://www.aes.com/xs/modelo}CardStatusRec" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardStatusModRq_Type", propOrder = {
    "rqUID",
    "msgRqHdr",
    "cardStatusRec"
})
public class CardStatusModRqType {

    @XmlElement(name = "RqUID", required = true)
    protected String rqUID;
    @XmlElement(name = "MsgRqHdr", required = true)
    protected MsgRqHdrType msgRqHdr;
    @XmlElement(name = "CardStatusRec")
    protected List<CardStatusRecType> cardStatusRec;

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
     * Gets the value of the cardStatusRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cardStatusRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardStatusRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardStatusRecType }
     * 
     * 
     */
    public List<CardStatusRecType> getCardStatusRec() {
        if (cardStatusRec == null) {
            cardStatusRec = new ArrayList<CardStatusRecType>();
        }
        return this.cardStatusRec;
    }

}
