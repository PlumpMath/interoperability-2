
package com.aes.service.accounts;

import javax.inject.Named;
import javax.jws.WebService;

import org.apache.commons.lang.StringUtils;
import org.apache.cxf.annotations.SchemaValidation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;

import com.aes.service.accounts.model.CardStatusModRsType;
import com.aes.service.accounts.model.CardStatusRecType;
import com.aes.service.accounts.model.ModCardStatusInput;
import com.aes.service.accounts.model.ModCardStatusOut;
import com.aes.service.accounts.model.ModCardStatusOutput;
import com.aes.service.accounts.model.StatusType;



@Named("cardFraudulentService")
@Scope(value = "singleton")
@WebService(endpointInterface = "com.aes.service.accounts.CardFraudulentService", targetNamespace = "http://com/aes/service/accounts/CardFraudulent",
        serviceName = "CardFraudulentService", portName = "CardFraudulentPort" )
@SchemaValidation
public class CardFraudulentServiceImpl implements CardFraudulentService {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public ModCardStatusOutput report(ModCardStatusInput modCardStatusRequest) {
		logger.info("==========================={}======================== ",modCardStatusRequest.getModCardStatusInp().getCardStatusModRq().getRqUID());
		logger.info("========INFORMACIÓN TARJETAS=====");
		for (CardStatusRecType item : modCardStatusRequest.getModCardStatusInp().getCardStatusModRq().getCardStatusRec()) {
			logger.info("======NUM_TARJETA:==={}===",item.getCardNum());
			logger.info("======STATUS_CODE:==={}===",item.getCardStatus().getCardStatusCode());
			logger.info("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		}
		
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
