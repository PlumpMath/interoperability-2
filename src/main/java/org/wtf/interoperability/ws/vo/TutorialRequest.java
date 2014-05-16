
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
 *         &lt;element ref="{http://example.com/tutotial/types/}request-structure"/>
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
    "requestStructure"
})
@XmlRootElement(name = "tutorial-request")
public class TutorialRequest {

    @XmlElement(name = "request-structure", namespace = "http://example.com/tutotial/types/", required = true)
    protected RequestStructure requestStructure;

    /**
     * Gets the value of the requestStructure property.
     * 
     * @return
     *     possible object is
     *     {@link RequestStructure }
     *     
     */
    public RequestStructure getRequestStructure() {
        return requestStructure;
    }

    /**
     * Sets the value of the requestStructure property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestStructure }
     *     
     */
    public void setRequestStructure(RequestStructure value) {
        this.requestStructure = value;
    }

}
