package mx.com.jtenorioh.alphavantage.rest.cryptocurrencies;

import mx.com.jtenorioh.alphavantage.rest.api.request.GeneralRequest;

public class CryptoCurrenciesRequest {
	private String fromCurrency;
	private String toCurrency;

	private static final String function = "CURRENCY_EXCHANGE_RATE";

	public String queryParameters(String function, String fromCurrency, String toCurrency) {
		StringBuilder builder = new StringBuilder();
		builder.append(GeneralRequest.URL_QUERY);
		builder.append("function=").append(function);
		builder.append("&from_currency=").append(fromCurrency);
		builder.append("&to_currency=").append(toCurrency);
		return builder.toString();
	}

	public String getFromCurrency() {
		return fromCurrency;
	}

	public void setFromCurrency(String fromCurrency) {
		this.fromCurrency = fromCurrency;
	}

	public String getToCurrency() {
		return toCurrency;
	}

	public void setToCurrency(String toCurrency) {
		this.toCurrency = toCurrency;
	}

	public static String getFunction() {
		return function;
	}

	@Override
	public String toString() {
		return "CryptoCurrenciesRequest [fromCurrency=" + fromCurrency + ", toCurrency=" + toCurrency + "]";
	}

}
