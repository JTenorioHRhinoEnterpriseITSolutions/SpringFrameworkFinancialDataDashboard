package mx.com.jtenorioh.alphavantage.rest.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Cryptocurrenies {
	@JsonProperty("From_Currency Code")
	private String fromCurrency;
	@JsonProperty("From_Currency Name")
	private String fromCurrencyName;
	@JsonProperty("To_Currency Code")
	private String toCurrency;
	@JsonProperty("To_Currency Name")
	private String toCurrencyName;
	@JsonProperty("Exchange Rate")
	private double exchangeRate;
	@JsonProperty("Last Refreshed")
	private String lastRefreshed;
	@JsonProperty("Time Zone")
	private String timezone;

	public Cryptocurrenies() {

	}

	public Cryptocurrenies(String fromCurrency, String fromCurrencyName, String toCurrency, String toCurrencyName,
			double exchangeRate, String lastRefreshed, String timezone) {
		super();
		this.fromCurrency = fromCurrency;
		this.fromCurrencyName = fromCurrencyName;
		this.toCurrency = toCurrency;
		this.toCurrencyName = toCurrencyName;
		this.exchangeRate = exchangeRate;
		this.lastRefreshed = lastRefreshed;
		this.timezone = timezone;
	}

	public String getFromCurrency() {
		return fromCurrency;
	}

	public void setFromCurrency(String fromCurrency) {
		this.fromCurrency = fromCurrency;
	}

	public String getFromCurrencyName() {
		return fromCurrencyName;
	}

	public void setFromCurrencyName(String fromCurrencyName) {
		this.fromCurrencyName = fromCurrencyName;
	}

	public String getToCurrency() {
		return toCurrency;
	}

	public void setToCurrency(String toCurrency) {
		this.toCurrency = toCurrency;
	}

	public String getToCurrencyName() {
		return toCurrencyName;
	}

	public void setToCurrencyName(String toCurrencyName) {
		this.toCurrencyName = toCurrencyName;
	}

	public double getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(double exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public String getLastRefreshed() {
		return lastRefreshed;
	}

	public void setLastRefreshed(String lastRefreshed) {
		this.lastRefreshed = lastRefreshed;
	}

	public String getTimezone() {
		return timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	@Override
	public String toString() {
		return "Cryptocurrenies [fromCurrency=" + fromCurrency + ", fromCurrencyName=" + fromCurrencyName
				+ ", toCurrency=" + toCurrency + ", toCurrencyName=" + toCurrencyName + ", exchangeRate=" + exchangeRate
				+ ", lastRefreshed=" + lastRefreshed + ", timezone=" + timezone + "]";
	}

}
