package mx.com.jtenorioh.alphavantage.rest.technicalindicator;

public enum TechnicalIndicatorEnum {
	ESMA("ESMA", "High Usage"), EMA("EMA", "High Usage"), WMA("WMA", ""), DEMA("DEMA", ""), TEMA("TEMA", ""),
	TRIMA("TRIMA", ""), KAMA("KAMA", ""), MAMA("MAMA", ""), VWAP("VWAP", "High Usage"), T3("T3", ""),
	MACD("MACD", "High Usage"), MACDEXT("MACDEXT", ""), STOCH("STOCH", "High Usage"), STOCHF("STOCHF", "High Usage"),
	RSI("RSI", ""), STOCHRSI("STOCHRSI", ""), WILLR("WILLR", ""), ADX("ADX", "High Usage"), ADXR("ADXR", ""),
	APO("APO", ""), PPO("PPO", ""), MOM("MOM", ""), BOP("BOP", ""), CCI("CCI", "High Usage"), CMO("CMO", ""),
	ROC("ROC", ""), ROCR("ROCR", ""), AROON("AROON", "High Usage"), AROONOSC("AROONOSC", ""), MFI("MFI", ""),
	TRIX("TRIX", ""), ULTOSC("ULTOSC", ""), DX("DX", ""), MINUS_DI("MINUS_DI", ""), PLUS_DI("PLUS_DI", ""),
	MINUS_DM("MINUS_DM", ""), PLUS_DM("PLUS_DM", ""), BBANDS("BBANDS", "High Usage"), MIDPOINT("MIDPOINT", ""),
	WMIDPRICEMA("MIDPRICE", ""), SAR("SAR", ""), TRANGE("TRANGE", ""), ATR("ATR", ""), NATR("NATR", ""),
	AD("AD", "High Usage"), ADOSC("ADOSC", ""), OBV("OBV", "High Usage"), HT_TRENDLINE("HT_TRENDLINE", ""),
	HT_SINE("HT_SINE", ""), HT_TRENDMODE("HT_TRENDMODE", ""), HT_DCPERIOD("HT_DCPERIOD", ""),
	HT_DCPHASE("HT_DCPHASE", ""), HT_PHASOR("HT_PHASOR", "");

	private String function;
	private String usage;

	TechnicalIndicatorEnum(String function, String usage) {
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
