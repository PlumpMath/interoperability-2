package com.example.tutorial.ws.integration;

import java.net.URISyntaxException;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;
import org.wtf.interoperability.ws.vo.RequiredHeaderMissingFault;
import org.wtf.interoperability.ws.vo.SystemUnavailableFault;

import com.aes.service.accounts.CardFraudulentService;
import com.aes.service.accounts.model.ModCardStatusInput;

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
		getPort().report(modCardStatusRequest);
	}
}
