package com.exchangerate.product.dashboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.exchangerate.product.dashboard.model.ExchangeRate;
import com.exchangerate.product.dashboard.service.ExchangeRateService;

@Controller
@RequestMapping("/v1")
public class ExchangeRateController {

	@Autowired
	@Qualifier("exchangeRateServiceImp")
	ExchangeRateService exchangeRateService;
	
	@PostMapping
	@ResponseBody
	public ExchangeRate add(@RequestBody ExchangeRate exchangeRate) {
		return exchangeRateService.add(exchangeRate);
	}
}
