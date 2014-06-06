package org.wtf.interoperability.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aes.service.accounts.fraudquery.ArrayOfCardKeysType;
import com.aes.service.accounts.fraudquery.CardKeysType;
import com.aes.service.accounts.fraudquery.CardStatusInqRqType;
import com.aes.service.accounts.fraudquery.ContextRqHdrType;
import com.aes.service.accounts.fraudquery.GetCardStatusInp;
import com.aes.service.accounts.fraudquery.GetCardStatusOut;
import com.aes.service.accounts.fraudquery.IConsultarFraudes;
import com.aes.service.accounts.fraudquery.MsgRqHdrType;

@Controller
@RequestMapping("/sample")
public class SampleController  {
	
	@Autowired private ApplicationContext applicationContext;
	
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody GetCardStatusOut getShopInJSON() { 
		
		IConsultarFraudes port=  applicationContext.getBean("testClientConsultaFraudes", IConsultarFraudes.class);
		
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
		
		
		GetCardStatusOut out= port.getCardStatus(value1 );
		
		return out;
	}

	/*@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody ModCardStatusOutput getShopInJSON() { 
		
		CardFraudulentService port= applicationContext.getBean("testClient", CardFraudulentService.class);
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
		
		ModCardStatusOutput out = port.report(modCardStatusRequest);
		return out;
		
 
	}*/
	

}