
package com.aes.service.accounts.fraudquery;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCardKeys_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCardKeys_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CardKeys" type="{http://www.aes.com/xs/modelo}CardKeys_Type" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCardKeys_Type", propOrder = {
    "cardKeys"
})
public class ArrayOfCardKeysType {

    @XmlElement(name = "CardKeys")
    protected List<CardKeysType> cardKeys;

    /**
     * Gets the value of the cardKeys property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cardKeys property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardKeys().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardKeysType }
     * 
     * 
     */
    public List<CardKeysType> getCardKeys() {
        if (cardKeys == null) {
            cardKeys = new ArrayList<CardKeysType>();
        }
        return this.cardKeys;
    }

}
