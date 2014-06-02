
package com.aes.service.accounts;

import javax.inject.Named;
import javax.jws.WebService;

import org.apache.commons.lang.StringUtils;
import org.springframework.context.annotation.Scope;

import com.aes.service.accounts.model.CardStatusModRsType;
import com.aes.service.accounts.model.ModCardStatusInput;
import com.aes.service.accounts.model.ModCardStatusOut;
import com.aes.service.accounts.model.ModCardStatusOutput;
import com.aes.service.accounts.model.StatusType;



@Named("cardFraudulentService")
@Scope(value = "singleton")
@WebService(endpointInterface = "com.aes.service.accounts.CardFraudulentService", targetNamespace = "http://com/aes/service/accounts/CardFraudulent",
        serviceName = "CardFraudulentService", portName = "CardFraudulentPort" )
public class CardFraudulentServiceImpl implements CardFraudulentService {

	@Override
	public ModCardStatusOutput report(ModCardStatusInput modCardStatusRequest) {
		ModCardStatusOutput out = new ModCardStatusOutput();
		ModCardStatusOut modCardStatusOut =new ModCardStatusOut();
		out.setModCardStatusOut(modCardStatusOut);
		
		CardStatusModRsType cardStatusModRsType = new CardStatusModRsType();
		modCardStatusOut.setCardStatusModRs(cardStatusModRsType);	
		cardStatusModRsType.setRqUID(modCardStatusRequest.getModCardStatusInp().getCardStatusModRq().getRqUID());
		StatusType status = new StatusType();
		status.setServerStatusCode("OK");
		status.setSeverity("Info");
		status.setStatusCode(0);
		status.setStatusDesc(StringUtils.EMPTY);
		
		cardStatusModRsType.setStatus(status );
		
		return out;
	}
   
}
