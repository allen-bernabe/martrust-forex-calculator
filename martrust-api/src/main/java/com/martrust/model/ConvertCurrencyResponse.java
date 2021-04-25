package com.martrust.model;

public class ConvertCurrencyResponse {

	private String currencyOne;
	private Float currencyOneAmount;
	private String currencyTwo;
	private Float results;
	private Float conversion;

	public Float getConversion() {
		return conversion;
	}

	public void setConversion(Float conversion) {
		this.conversion = conversion;
	}

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

	public Float getResults() {
		return results;
	}

	public void setResults(Float results) {
		this.results = results;
	}

}
