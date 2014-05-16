
package org.wtf.interoperability.ws.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.wtf.interoperability.ws.vo package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ResponseStructure_QNAME = new QName("http://example.com/tutotial/types/", "response-structure");
    private final static QName _RequestStructure_QNAME = new QName("http://example.com/tutotial/types/", "request-structure");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.wtf.interoperability.ws.vo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SystemUnavailableFaultMessage }
     * 
     */
    public SystemUnavailableFaultMessage createSystemUnavailableFaultMessage() {
        return new SystemUnavailableFaultMessage();
    }

    /**
     * Create an instance of {@link RequestStructure }
     * 
     */
    public RequestStructure createRequestStructure() {
        return new RequestStructure();
    }

    /**
     * Create an instance of {@link RequiredHeaderMissingFaultMessage }
     * 
     */
    public RequiredHeaderMissingFaultMessage createRequiredHeaderMissingFaultMessage() {
        return new RequiredHeaderMissingFaultMessage();
    }

    /**
     * Create an instance of {@link ResponseStructure }
     * 
     */
    public ResponseStructure createResponseStructure() {
        return new ResponseStructure();
    }

    /**
     * Create an instance of {@link RequestStructure.Tag }
     * 
     */
    public RequestStructure.Tag createRequestStructureTag() {
        return new RequestStructure.Tag();
    }

    /**
     * Create an instance of {@link MessageSource }
     * 
     */
    public MessageSource createMessageSource() {
        return new MessageSource();
    }

    /**
     * Create an instance of {@link TutorialRequest }
     * 
     */
    public TutorialRequest createTutorialRequest() {
        return new TutorialRequest();
    }

    /**
     * Create an instance of {@link TutorialResponse }
     * 
     */
    public TutorialResponse createTutorialResponse() {
        return new TutorialResponse();
    }

    /**
     * Create an instance of {@link MessageAcknowledgment }
     * 
     */
    public MessageAcknowledgment createMessageAcknowledgment() {
        return new MessageAcknowledgment();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example.com/tutotial/types/", name = "response-structure")
    public JAXBElement<ResponseStructure> createResponseStructure(ResponseStructure value) {
        return new JAXBElement<ResponseStructure>(_ResponseStructure_QNAME, ResponseStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example.com/tutotial/types/", name = "request-structure")
    public JAXBElement<RequestStructure> createRequestStructure(RequestStructure value) {
        return new JAXBElement<RequestStructure>(_RequestStructure_QNAME, RequestStructure.class, null, value);
    }

}
