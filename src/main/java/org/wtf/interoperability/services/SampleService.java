package org.wtf.interoperability.services;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.BindingType;

import org.wtf.interoperability.model.Shop;

@WebService
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING) 
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL,
	parameterStyle=SOAPBinding.ParameterStyle.BARE)
public interface SampleService {
		
	
	@WebMethod
	public Shop getShop(String name);

	
}