package mx.com.jtenorioh.alphavantage.rest.cryptocurrencies;

import mx.com.jtenorioh.alphavantage.rest.model.Cryptocurrenies;

public class CryptoCurrenciesResponse {
	private Cryptocurrenies quote;

	public Cryptocurrenies getQuote() {
		return quote;
	}

	public void setQuote(Cryptocurrenies quote) {
		this.quote = quote;
	}

	@Override
	public String toString() {
		return "CryptoCurrenciesResponse [quote=" + quote + "]";
	}

}
