package com.exchangerate.product.dashboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.exchangerate.product.dashboard.model.ProductList;
import com.exchangerate.product.dashboard.service.ProductListService;

@Controller
@RequestMapping("/v2")
public class ProductListController {

	@Autowired
	@Qualifier("productListServiceImp")
	ProductListService productListService;
	

	@GetMapping(params = {"itemName", "currencyAlpha"})
	@ResponseBody
	public String calculateProductRate(@RequestParam("itemName") String itemName,
			@RequestParam("currencyAlpha") String currencyAlpha) {
		return productListService.calculateProductRate(itemName, currencyAlpha);
	}

	@PostMapping
	@ResponseBody
	public ProductList add(@RequestBody ProductList productList) {
		return productListService.add(productList);
	}
}
