package com.exchangerate.product.dashboard.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exchangerate.product.dashboard.model.ExchangeRate;

@Repository
public interface ExchangeRateRepository extends JpaRepository<ExchangeRate, Long>  {

	List<ExchangeRate> findAllByCurrencyAlpha(String currencyAlpha);
	
}
