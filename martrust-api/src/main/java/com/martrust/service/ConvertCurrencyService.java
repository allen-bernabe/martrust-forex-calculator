package com.martrust.service;

import java.time.Duration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

import com.martrust.model.ConvertCurrencyRequest;
import com.martrust.model.ConvertCurrencyResponse;
import com.mysql.cj.util.StringUtils;

public class ConvertCurrencyService {
	
	@Value("${currency.conversion.api.url}")
	private String currencyApiUrl;
	
	@Value("${currency.conversion.api.key}")
	private String apiKey;
	
	public ConvertCurrencyResponse convertCurrency(ConvertCurrencyRequest request) {
		
		ConvertCurrencyResponse response = new ConvertCurrencyResponse();
		
		String uri = currencyApiUrl + "?q=" + request.getCurrencyOne() + "_" + request.getCurrencyTwo() + "&compact=ultra&apiKey=" + apiKey;
		
		RestTemplate restTemplate = new RestTemplate();
		
		String result = restTemplate.getForObject(uri, String.class);
		String oneCurrency = result.substring(result.indexOf(":") + 1, result.indexOf("}"));
		Float actualAmountOneCurrency = Float.parseFloat(oneCurrency);
		
		Float actualConvertedAmount = request.getCurrencyOneAmount() * actualAmountOneCurrency;
		
		response.setCurrencyOne(request.getCurrencyOne());
		response.setCurrencyOneAmount(request.getCurrencyOneAmount());
		response.setCurrencyTwo(request.getCurrencyTwo());
		response.setResults(actualConvertedAmount);
		response.setConversion(actualAmountOneCurrency);
		
		return response;
		
	}
	
	// For calling External APIs
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		 
	    return builder
	            .setConnectTimeout(Duration.ofMillis(3000))
	            .setReadTimeout(Duration.ofMillis(3000))
	            .build();
	}
	
}
