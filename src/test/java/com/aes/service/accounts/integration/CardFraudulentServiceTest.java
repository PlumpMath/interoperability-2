package com.aes.service.accounts.integration;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import com.aes.service.accounts.CardFraudulentService;
import com.aes.service.accounts.model.CardStatusModRqType;
import com.aes.service.accounts.model.CardStatusRecType;
import com.aes.service.accounts.model.CardStatusType;
import com.aes.service.accounts.model.ContextRqHdrType;
import com.aes.service.accounts.model.ModCardStatusInp;
import com.aes.service.accounts.model.ModCardStatusInput;
import com.aes.service.accounts.model.ModCardStatusOutput;
import com.aes.service.accounts.model.MsgRqHdrType;

@ContextConfiguration(locations = {        
        "classpath*:/META-INF/cxf/cxf.xml",        
        "classpath*:/**/war-spring-test.xml"
})
public class CardFraudulentServiceTest extends AbstractTestNGSpringContextTests{
	
	

	public CardFraudulentService getPort() {
		return applicationContext.getBean("testClient", CardFraudulentService.class);
	}
	
	@Test(groups = "remote-integration")
	public void basicTest()  {
		
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
		CardStatusRecType e = new CardStatusRecType();
		value2.getCardStatusRec().add(e);
		e.setCardNum("2522355663336633335");
		CardStatusType value5 = new CardStatusType();
		e.setCardStatus(value5 );
		value5.setCardStatusAction("xxx");
		value5.setCardStatusCode("0");
		value5.setStatusDesc("xxxx");
		value5.setStatusReason("ddd");
		
		ModCardStatusOutput out=  getPort().report(modCardStatusRequest);
		System.out.println(out.getModCardStatusOut().getCardStatusModRs().getRqUID());
	}
}
