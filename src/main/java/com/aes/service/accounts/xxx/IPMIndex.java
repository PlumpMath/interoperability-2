
package com.aes.service.accounts.xxx;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="indexRequest" type="{http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM}IndexRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "indexRequest"
})
@XmlRootElement(name = "IPMIndex", namespace = "http://tempuri.org/")
public class IPMIndex {

    @XmlElementRef(name = "indexRequest", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<IndexRequest> indexRequest;

    /**
     * Gets the value of the indexRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IndexRequest }{@code >}
     *     
     */
    public JAXBElement<IndexRequest> getIndexRequest() {
        return indexRequest;
    }

    /**
     * Sets the value of the indexRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IndexRequest }{@code >}
     *     
     */
    public void setIndexRequest(JAXBElement<IndexRequest> value) {
        this.indexRequest = ((JAXBElement<IndexRequest> ) value);
    }

}
