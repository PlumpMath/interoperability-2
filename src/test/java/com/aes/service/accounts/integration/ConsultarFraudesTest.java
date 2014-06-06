package com.aes.service.accounts.integration;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import com.aes.service.accounts.fraudquery.CardStatusInqRqType;
import com.aes.service.accounts.fraudquery.GetCardStatusInp;
import com.aes.service.accounts.fraudquery.GetCardStatusOut;
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
		
		GetCardStatusInp value1 = new GetCardStatusInp();
		CardStatusInqRqType value2 = new CardStatusInqRqType();
		value2.setRqUID("10000000-1111-2222-3333-000000000000");
		value1.setCardStatusInqRq(value2 );
		GetCardStatusOut x= getPort().getCardStatus(value1 );
		System.out.println(x.getCardStatusInqRs());
	}
}
