package com.exchangerate.product.dashboard.service;

import com.exchangerate.product.dashboard.model.ProductList;

public interface ProductListService {

	public String calculateProductRate(String itemName, String currencyAlpha);
	
	public ProductList add(ProductList productList);
}
