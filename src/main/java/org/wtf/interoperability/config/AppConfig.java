package org.wtf.interoperability.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("/WEB-INF/beans.xml")
public class AppConfig {

	@Bean(name="object")
	public Object object(){		
		System.out.println("Inciando aplicacion............");
		return new Object();
	}
	
}
