package com.project2.microservices.currentconvertionrateservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.project2.microservices.currentconvertionrateservice.beans.ExchangeRates;
import com.project2.microservices.currentconvertionrateservice.repository.ExchangeRateRepository;

@RestController
public class CurrencyExchangeValues {
	@Autowired
	ExchangeRateRepository exRateRepo;
	@Autowired
	Environment environment;
	@GetMapping("exchangeValue/{exFrom}/to/{exTo}")
	public ExchangeRates ExchangeValue(@PathVariable String exFrom,@PathVariable String exTo) {
		ExchangeRates exchangeRatesObj= exRateRepo.findByFromCountryAndToCountry(exFrom, exTo); 
		exchangeRatesObj.setPortNo(environment.getProperty("local.server.port"));
		return exchangeRatesObj;
	}	

}
