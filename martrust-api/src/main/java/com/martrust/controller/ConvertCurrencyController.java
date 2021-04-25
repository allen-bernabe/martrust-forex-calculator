package com.martrust.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.martrust.model.ConvertCurrencyRequest;
import com.martrust.model.ConvertCurrencyResponse;
import com.martrust.service.ConvertCurrencyService;

@RestController
public class ConvertCurrencyController {

	private ConvertCurrencyService convertCurrencyService;
	
	public ConvertCurrencyController(ConvertCurrencyService convertCurrencyService) {
		super();
		this.convertCurrencyService = convertCurrencyService;
	}
	
	@PostMapping("/convert")
	public ConvertCurrencyResponse convertCurrency(@RequestBody ConvertCurrencyRequest request) {
				
		ConvertCurrencyResponse response = new ConvertCurrencyResponse();
		
		response = convertCurrencyService.convertCurrency(request);
		
		return response;
	}
	
}
