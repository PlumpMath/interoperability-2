package com.aes.service.accounts.integration;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import com.aes.service.accounts.fraudquery.IConsultarFraudes;

@ContextConfiguration(locations = {        
        "classpath*:/META-INF/cxf/cxf.xml",      
        "classpath*:/**/war-spring-test.xml"
})
public class ConsultarFraudesTest  extends  AbstractTestNGSpringContextTests{

	
	public IConsultarFraudes getPort() {
		return applicationContext.getBean("testClientConsultaFraudes", IConsultarFraudes.class);
	}
	
	
	@Test(groups = "remote-integration")
	public void basicTest()  {
		 getPort().getCardStatus(null);
	}
}
