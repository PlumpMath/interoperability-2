package com.aes.service.accounts.integration;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import com.aes.service.accounts.fraudquery.ArrayOfCardKeysType;
import com.aes.service.accounts.fraudquery.CardKeysType;
import com.aes.service.accounts.fraudquery.CardStatusInqRqType;
import com.aes.service.accounts.fraudquery.ContextRqHdrType;
import com.aes.service.accounts.fraudquery.GetCardStatusInp;
import com.aes.service.accounts.fraudquery.GetCardStatusOut;
import com.aes.service.accounts.fraudquery.IConsultarFraudes;
import com.aes.service.accounts.fraudquery.MsgRqHdrType;

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
		MsgRqHdrType value3 = new MsgRqHdrType();
		value2.setMsgRqHdr(value3 );		
		ArrayOfCardKeysType value5 = new ArrayOfCardKeysType();
		value2.setCardSel(value5 );
		ContextRqHdrType value4= new ContextRqHdrType();		
		value3.setContextRqHdr(value4);		
		value4.setClientDt("2014-06-06T09:00:00");		
		CardKeysType value6= new CardKeysType();
		value5.getCardKeys().add(value6);		
		value6.setCardNum("256662322235552");
		
		
		GetCardStatusOut x= getPort().getCardStatus(value1 );
		System.out.println(x.getCardStatusInqRs());
	}
}
