package mx.com.jtenorioh.alphavantage.rest.sectorperformances;

import mx.com.jtenorioh.alphavantage.rest.api.request.GeneralRequest;

public class SectorRequest implements GeneralRequest {
	private SectorEnum sectorEnum;

	@Override
	public String queryParameters(String function) {
		StringBuilder builder = new StringBuilder();
		builder.append(GeneralRequest.URL_QUERY);
		builder.append("function=").append(function);
		builder.append("&apikey=demo");
		return builder.toString();
	}

	public SectorEnum getSectorEnum() {
		return sectorEnum;
	}

	public void setSectorEnum(SectorEnum sectorEnum) {
		this.sectorEnum = sectorEnum;
	}

}
