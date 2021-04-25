package com.martrust.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.martrust.service.ConvertCurrencyService;

@Configuration
public class MartrustConfig {
	
	@Bean
	public ConvertCurrencyService convertCurrencyService() {
		return new ConvertCurrencyService();
	}

}
