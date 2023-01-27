package com.accenture.orderInfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.DefaultUriBuilderFactory;

@SpringBootApplication
public class OrderInfoApplication {

	@Bean
	public RestTemplate getRestTemplate(){

		return new RestTemplate();
	}
	public static void main(String[] args) {
		SpringApplication.run(OrderInfoApplication.class, args);
	}

}
