package mx.com.jtenorioh.alphavantage.rest.forex;

public enum ForeignExhangeFXEnum {
	CURRENCY_EXCHANGE_RATE("CURRENCY_EXCHANGE_RATE", "High Usage"), FX_INTRADAY("FX_INTRADAY", "High Usage"),
	FX_DAILY("FX_DAILY", ""), FX_WEEKLY("FX_WEEKLY", ""), FX_MONTHLY("FX_MONTHLY", "");

	private String function;
	private String usage;

	ForeignExhangeFXEnum(String function, String usage) {
		this.function = function;
		this.usage = usage;
	}

	public String getFunction() {
		return function;
	}

	public String getUsage() {
		return usage;
	}

}
