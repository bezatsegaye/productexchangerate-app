package com.exchangerate.product.dashboard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exchangerate.product.dashboard.model.ExchangeRate;
import com.exchangerate.product.dashboard.repository.ExchangeRateRepository;

@Service
public class ExchangeRateServiceImpl implements ExchangeRateService {

	@Autowired
	ExchangeRateRepository exchangeRateRepository;
	@Override
	public ExchangeRate add(ExchangeRate exchangeRate) {
		return exchangeRateRepository.save(exchangeRate);
	}

}
