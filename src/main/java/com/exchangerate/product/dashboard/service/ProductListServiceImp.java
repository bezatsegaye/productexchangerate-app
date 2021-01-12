package com.exchangerate.product.dashboard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exchangerate.product.dashboard.model.ExchangeRate;
import com.exchangerate.product.dashboard.model.ProductList;
import com.exchangerate.product.dashboard.repository.ExchangeRateRepository;
import com.exchangerate.product.dashboard.repository.ProductListRepository;

@Service
public class ProductListServiceImp implements ProductListService {

	@Autowired
	ProductListRepository productListRepository;
	
	@Autowired
	ExchangeRateRepository exchangeRateRepository;
	
	@Override
	public String calculateProductRate(String itemName, String currencyAlpha) {
		List<ProductList> productLists = productListRepository.findAllByItemName(itemName);
		List<ExchangeRate> exchangeRates = exchangeRateRepository.findAllByCurrencyAlpha(currencyAlpha);
//		double result = Double.parseDouble(productLists.get(1)+"");
		ProductList prod = productLists.get(0);
		ExchangeRate exe = exchangeRates.get(0);
		double result = prod.getItemCost() * exe.getCurrencyValue();
		return prod.getItemName() + " " + exe.getCurrencyValue() + " (" + result + ") , USD (" + prod.getItemCost() + ")";
	}

	@Override
	public ProductList add(ProductList productList) {
		return productListRepository.save(productList);
	}

}
