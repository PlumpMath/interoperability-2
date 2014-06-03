package com.aes.service.accounts;

import java.util.Map;

import javax.xml.ws.BindingProvider;

import com.aes.service.accounts.model.CardFraudulent;
import com.aes.service.accounts.model.CardStatusModRqType;
import com.aes.service.accounts.model.ContextRqHdrType;
import com.aes.service.accounts.model.ModCardStatusInp;
import com.aes.service.accounts.model.ModCardStatusInput;
import com.aes.service.accounts.model.MsgRqHdrType;


public class WSClient {

	public static void main(String[] args) {
		System.setProperty("jsse.enableSNIExtension", "false");
		
		com.aes.service.accounts.model.CardFraudulentService service = new com.aes.service.accounts.model.CardFraudulentService();
		CardFraudulent port = service.getCardFraudulentPort();

		// WS-SecurityPolicy configuration method

		Map ctx = ((BindingProvider)port).getRequestContext();
		ctx.put("ws-security.username", "joe1");
		ctx.put("ws-security.callback-handler", ClientPasswordCallback.class.getName());
		// instead of above line can also do:
		//ctx.put("ws-security.password", "master");


		ModCardStatusInput modCardStatusRequest = new ModCardStatusInput();
		ModCardStatusInp modCardStatusInp= new ModCardStatusInp();
		modCardStatusRequest.setModCardStatusInp(modCardStatusInp);
		CardStatusModRqType value = new CardStatusModRqType();
		modCardStatusInp.setCardStatusModRq(value );
		value.setRqUID("10000000-1111-2222-3333-000000000000");
				
		MsgRqHdrType value1= new MsgRqHdrType();
		ContextRqHdrType value2= new ContextRqHdrType();
		value2.setClientDt("2014-05-21T09:00:00");
				
		value1.setContextRqHdr(value2);
		
		value.setMsgRqHdr(value1);

		port.report(modCardStatusRequest );
		

		// Alternative CXF interceptor config method
		
        /*Client client = org.apache.cxf.frontend.ClientProxy.getClient(port);
        Endpoint cxfEndpoint = client.getEndpoint();
        Map outProps = new HashMap();
        outProps.put(WSHandlerConstants.ACTION, WSHandlerConstants.USERNAME_TOKEN);
        outProps.put(WSHandlerConstants.SIG_KEY_ID, "DirectReference"); 
        
        outProps.put(WSHandlerConstants.USER, "joe");
        outProps.put(WSHandlerConstants.PASSWORD_TYPE, WSConstants.PW_TEXT);
        outProps.put(WSHandlerConstants.PW_CALLBACK_CLASS,
            ClientPasswordCallback.class.getName());

        WSS4JOutInterceptor wssOut = new WSS4JOutInterceptor(outProps);
        cxfEndpoint.getOutInterceptors().add(wssOut);*/
				
		
	}
}