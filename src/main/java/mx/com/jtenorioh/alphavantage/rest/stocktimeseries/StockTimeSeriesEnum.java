package mx.com.jtenorioh.alphavantage.rest.stocktimeseries;

public enum StockTimeSeriesEnum {
	INTRADAY("TIME_SERIES_INTRADAY", "High Usage"), DAILY("TIME_SERIES_DAILY", "High Usage"),
	DAILY_ADJUSTED("TIME_SERIES_DAILY_ADJUSTED", "High Usage"), WEEKLY("TIME_SERIES_WEEKLY", ""),
	WEEKLY_ADJUSTED("TIME_SERIES_WEEKLY_ADJUSTED", ""), MONTHLY("TIME_SERIES_MONTHLY", ""),
	MONTHLY_ADJUSTED("TIME_SERIES_MONTHLY_ADJUSTED", ""), QUOTE_ENDPOINT("GLOBAL_QUOTE", "High Usage"),
	SEARCH_ENDPOINT("SYMBOL_SEARCH", "High Usage");

	private String function;
	private String usage;

	StockTimeSeriesEnum(String function, String usage) {
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
