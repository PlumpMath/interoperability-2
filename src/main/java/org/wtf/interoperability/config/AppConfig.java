package org.wtf.interoperability.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("/WEB-INF/beans.xml")
public class AppConfig {

	private @Value("#{keystoreProperties['org.apache.ws.security.crypto.merlin.file']}") String file;
	
	@Bean(name="object")
	public Object object(){		
		System.out.println(file);
		return file;
	}
	
}
