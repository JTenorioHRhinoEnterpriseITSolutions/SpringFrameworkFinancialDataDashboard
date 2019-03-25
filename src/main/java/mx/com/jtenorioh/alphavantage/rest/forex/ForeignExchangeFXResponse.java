package mx.com.jtenorioh.alphavantage.rest.forex;

import java.util.Date;
import java.util.Map;

import mx.com.jtenorioh.alphavantage.rest.api.response.MetaData;
import mx.com.jtenorioh.alphavantage.rest.model.ForeignExchangeFX;

public class ForeignExchangeFXResponse {
	private MetaData metaData;
	private Map<Date, ForeignExchangeFX> foreignExchangeQuotes;

	public MetaData getMetaData() {
		return metaData;
	}

	public void setMetaData(MetaData metaData) {
		this.metaData = metaData;
	}

	public Map<Date, ForeignExchangeFX> getForeignExchangeQuotes() {
		return foreignExchangeQuotes;
	}

	public void setForeignExchangeQuotes(Map<Date, ForeignExchangeFX> foreignExchangeQuotes) {
		this.foreignExchangeQuotes = foreignExchangeQuotes;
	}

}
