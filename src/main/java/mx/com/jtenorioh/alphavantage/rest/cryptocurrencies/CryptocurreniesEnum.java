package mx.com.jtenorioh.alphavantage.rest.cryptocurrencies;

public enum CryptocurreniesEnum {
	EXCHANGE_RATES("CURRENCY_EXCHANGE_RATE"), DAILY("DIGITAL_CURRENCY_DAILY"), WEEKLY("DIGITAL_CURRENCY_WEEKLY"),
	MONTHLY("DIGITAL_CURRENCY_MONTHLY");

	private String function;

	CryptocurreniesEnum(String function) {
		this.function = function;
	}

	public String getFunction() {
		return function;
	}

}
