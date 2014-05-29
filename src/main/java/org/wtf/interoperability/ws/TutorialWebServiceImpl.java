/*
 * Created on Apr 5, 2011
 */
package org.wtf.interoperability.ws;

import javax.inject.Named;
import javax.jws.WebService;
import javax.xml.ws.Holder;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.wtf.interoperability.ws.vo.MessageAcknowledgment;
import org.wtf.interoperability.ws.vo.MessageSource;
import org.wtf.interoperability.ws.vo.RequiredHeaderMissingFault;
import org.wtf.interoperability.ws.vo.RequiredHeaderMissingFaultMessage;
import org.wtf.interoperability.ws.vo.ResponseStructure;
import org.wtf.interoperability.ws.vo.SystemUnavailableFault;
import org.wtf.interoperability.ws.vo.SystemUnavailableFaultMessage;
import org.wtf.interoperability.ws.vo.TutorialRequest;
import org.wtf.interoperability.ws.vo.TutorialResponse;

/**
 * The implementation of the web-service interface generated from the WSDL.  Obviously this example is trivial, but
 * it servers to show how such a service might be constructed and implemented.
 *
 * @author Ross M. Lodge
 */
@Named("TutorialWebService")
@Scope(value = "singleton")
@WebService(endpointInterface = "org.wtf.interoperability.ws.TutorialWebService", targetNamespace = "http://example.com/tutotial/",
        serviceName = "TutorialWebService", portName = "TutorialWebServiceSOAP" )
public class TutorialWebServiceImpl implements TutorialWebService {
	
	private final Logger log = LoggerFactory.getLogger(getClass());


	/**
	 * @param message
	 * @param headerName
	 * @throws RequiredHeaderMissingFault
	 */
	private void throwRequiredHeaderFault(String message, String headerName) throws RequiredHeaderMissingFault {
		RequiredHeaderMissingFaultMessage faultInfo = new RequiredHeaderMissingFaultMessage();
		faultInfo.setMessage(message);
		faultInfo.setMissingHeaderName(headerName);
		throw new RequiredHeaderMissingFault(message, faultInfo);
	}
	
	

	
	/*
	 * (non-Javadoc)
	 * @see org.wtf.interoperability.ws.vo.TutorialWebService#sendTutorialMessage(org.wtf.interoperability.ws.vo.TutorialRequest, org.wtf.interoperability.ws.vo.MessageSource, javax.xml.ws.Holder, javax.xml.ws.Holder)
	 */
	@Override
	public void sendTutorialMessage(TutorialRequest parameters,
			MessageSource source, Holder<TutorialResponse> response,
			Holder<MessageAcknowledgment> acknowledgment)
			throws RequiredHeaderMissingFault, SystemUnavailableFault {
		log.info("Received request message: {}", parameters.getRequestStructure());
		if (source == null) {
			throwRequiredHeaderFault("Source cannot be null.", "source");
		}
		else if (StringUtils.isEmpty(source.getMessageIdentifier())) {
			throwRequiredHeaderFault("messageIdentifier cannot be null or empty.", "message-identifier");
		}
		else if (StringUtils.isEmpty(source.getSystemIdentifier())) {
			throwRequiredHeaderFault("systemIdentifier cannot be null or empty.", "system-identifier");
		}
		else if (source.getMessageIdentifier().equals("SYSTEM FAILURE")) {
			SystemUnavailableFaultMessage faultInfo = new SystemUnavailableFaultMessage();
			faultInfo.setMessage("SystemUnvailabelFault requested.");
			throw new SystemUnavailableFault(faultInfo.getMessage(), faultInfo);
		}
		TutorialResponse responseMessage = new TutorialResponse();
		ResponseStructure responseStructure = new ResponseStructure();
		responseStructure.setResponseCode("00000");
		responseStructure.setResponseMessage("SUCCESS!");
		//responseStructure.setServerDate(Calendar.getInstance());
		responseMessage.setResponseStructure(responseStructure);
		response.value = responseMessage;
		
		MessageAcknowledgment acknowledgmentMessage = new MessageAcknowledgment();
		acknowledgmentMessage.setSomeMessage("WE ACKNOWLEDGE!");
		acknowledgment.value = acknowledgmentMessage;
	}

}
