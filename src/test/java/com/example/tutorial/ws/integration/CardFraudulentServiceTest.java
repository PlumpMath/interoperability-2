package com.example.tutorial.ws.integration;

import java.net.URISyntaxException;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;
import org.wtf.interoperability.ws.vo.RequiredHeaderMissingFault;
import org.wtf.interoperability.ws.vo.SystemUnavailableFault;

import com.aes.service.accounts.CardFraudulentService;
import com.aes.service.accounts.model.CardStatusModRqType;
import com.aes.service.accounts.model.ContextRqHdrType;
import com.aes.service.accounts.model.ModCardStatusInp;
import com.aes.service.accounts.model.ModCardStatusInput;
import com.aes.service.accounts.model.MsgRqHdrType;

@ContextConfiguration(locations = {        
        "classpath*:/META-INF/cxf/cxf.xml",
        "classpath*:/META-INF/cxf/cxf-extension-soap.xml",
        "classpath*:/META-INF/cxf/cxf-extension-http.xml",
        "classpath*:/META-INF/cxf/cxf-extension-policy.xml",
        "classpath*:/META-INF/cxf/cxf-extension-ws-security.xml",
        "classpath*:/com/**/war-spring-test.xml"
})
public class CardFraudulentServiceTest extends AbstractTestNGSpringContextTests{
	
	

	public CardFraudulentService getPort() {
		return applicationContext.getBean("testClient", CardFraudulentService.class);
	}
	
	@Test(groups = "remote-integration")
	public void basicTest() throws URISyntaxException, RequiredHeaderMissingFault, SystemUnavailableFault {
		
		ModCardStatusInput modCardStatusRequest = new ModCardStatusInput();
		ModCardStatusInp value1 = new ModCardStatusInp();
		modCardStatusRequest.setModCardStatusInp(value1 );
		CardStatusModRqType value2 = new CardStatusModRqType();
		value1.setCardStatusModRq(value2 );
		value2.setRqUID("10000000-1111-2222-3333-000000000000");
		MsgRqHdrType value3 = new MsgRqHdrType();
		value2.setMsgRqHdr(value3 );
		ContextRqHdrType value4 = new ContextRqHdrType();
		value3.setContextRqHdr(value4 );
		value4.setClientDt("2014-05-21T09:00:00");
		
		getPort().report(modCardStatusRequest);
	}
}
