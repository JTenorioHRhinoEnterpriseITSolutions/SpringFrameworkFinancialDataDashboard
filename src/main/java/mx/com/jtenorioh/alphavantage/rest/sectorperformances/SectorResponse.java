package mx.com.jtenorioh.alphavantage.rest.sectorperformances;

import java.util.Date;
import java.util.Map;

import mx.com.jtenorioh.alphavantage.rest.api.response.MetaData;
import mx.com.jtenorioh.alphavantage.rest.model.Sector;

public class SectorResponse {
	private MetaData metaData;
	private Map<Date, Sector>sector;
}
