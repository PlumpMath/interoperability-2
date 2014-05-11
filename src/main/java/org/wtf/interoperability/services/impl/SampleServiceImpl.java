package org.wtf.interoperability.services.impl;

import javax.jws.WebService;

import org.springframework.stereotype.Service;
import org.wtf.interoperability.model.Shop;
import org.wtf.interoperability.services.SampleService;

@Service("sampleService") 
@WebService(endpointInterface="org.wtf.interoperability.services.SampleService",serviceName = "SampleService",
targetNamespace = "http://www.wtf.com/oms/interoperability/1.0", portName = "SampleServicePort")
public class SampleServiceImpl implements SampleService {

	public Shop getShop(String name) {
		 
		Shop shop = new Shop();
		shop.setName(name);
		shop.setStaffName(new String[]{"mkyong1", "mkyong2"});
 
		return shop;
 
	}
}
