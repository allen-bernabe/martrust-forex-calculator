package com.martrust.model;

public class ConvertCurrencyRequest {

	private String currencyOne;
	private Float currencyOneAmount;
	private String currencyTwo;

	public String getCurrencyOne() {
		return currencyOne;
	}

	public void setCurrencyOne(String currencyOne) {
		this.currencyOne = currencyOne;
	}

	public Float getCurrencyOneAmount() {
		return currencyOneAmount;
	}

	public void setCurrencyOneAmount(Float currencyOneAmount) {
		this.currencyOneAmount = currencyOneAmount;
	}

	public String getCurrencyTwo() {
		return currencyTwo;
	}

	public void setCurrencyTwo(String currencyTwo) {
		this.currencyTwo = currencyTwo;
	}

}
