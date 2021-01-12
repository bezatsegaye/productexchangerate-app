package com.exchangerate.product.dashboard.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ExchangeRate {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String currencyAlpha;
	@Column(scale = 2)
	private Double currencyValue;
	
	public ExchangeRate() {
		super();
	}

	public ExchangeRate(long id, String currencyAlpha, Double currencyValue) {
		super();
		this.id = id;
		this.currencyAlpha = currencyAlpha;
		this.currencyValue = currencyValue;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCurrencyAlpha() {
		return currencyAlpha;
	}

	public void setCurrencyAlpha(String currencyAlpha) {
		this.currencyAlpha = currencyAlpha;
	}

	public Double getCurrencyValue() {
		return currencyValue;
	}

	public void setCurrencyValue(Double currencyValue) {
		this.currencyValue = currencyValue;
	}
	
	
}
