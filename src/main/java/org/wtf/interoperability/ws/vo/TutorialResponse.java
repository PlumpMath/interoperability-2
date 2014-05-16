
package org.wtf.interoperability.ws.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element ref="{http://example.com/tutotial/types/}response-structure"/>
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
    "responseStructure"
})
@XmlRootElement(name = "tutorial-response")
public class TutorialResponse {

    @XmlElement(name = "response-structure", namespace = "http://example.com/tutotial/types/", required = true)
    protected ResponseStructure responseStructure;

    /**
     * Gets the value of the responseStructure property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseStructure }
     *     
     */
    public ResponseStructure getResponseStructure() {
        return responseStructure;
    }

    /**
     * Sets the value of the responseStructure property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseStructure }
     *     
     */
    public void setResponseStructure(ResponseStructure value) {
        this.responseStructure = value;
    }

}
