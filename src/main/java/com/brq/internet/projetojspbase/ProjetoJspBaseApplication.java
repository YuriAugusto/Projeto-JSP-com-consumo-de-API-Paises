package com.brq.internet.projetojspbase;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan(basePackages = { "com.brq.internet.projetojspbase" })
public class ProjetoJspBaseApplication extends SpringBootServletInitializer {

	public final static String PATH_API_BASE = "https://restcountries.eu/rest/v2/all";
	
	public static void main(String[] args) {
		SpringApplication.run(ProjetoJspBaseApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ProjetoJspBaseApplication.class);
	}

	@Bean
	public WebTarget webTarget() {
		return ClientBuilder.newClient().target(PATH_API_BASE);
	}
	
}
