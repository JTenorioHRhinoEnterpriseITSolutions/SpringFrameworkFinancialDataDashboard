package mx.com.jtenorioh.alphavantage.rest.stocktimeseries;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

import mx.com.jtenorioh.alphavantage.rest.api.response.AlphaVantageResponse;
import mx.com.jtenorioh.alphavantage.rest.api.response.MetaData;
import mx.com.jtenorioh.alphavantage.rest.model.StockTimeSeries;
import mx.com.jtenorioh.alphavantage.rest.util.GlobalJsonParser;

public class StockTimeSeriesDeserializer extends JsonDeserializer<StockTimeSeriesResponse> {

	private static final SimpleDateFormat DATE_TIME_PARSER = new SimpleDateFormat("yyyy-MM-dd HH:mm:SS");
	private static final SimpleDateFormat DATE_PARSER = new SimpleDateFormat("yyyy-MM-dd");

	@Override
	public StockTimeSeriesResponse deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)
			throws IOException, JsonProcessingException {
		StockTimeSeriesResponse timeSeriesResult = new StockTimeSeriesResponse();
		ObjectCodec oc = jsonParser.getCodec();
		JsonNode node = oc.readTree(jsonParser);
		try {
			timeSeriesResult.setMetaData(AlphaVantageResponse.getMetaData(node));
			timeSeriesResult.setStockTimeSeries(getDateObjectMap(node));
		} catch (Throwable throwable) {
			System.out.println("Error when deserializing:");
			System.out.println(node.toString());
			throwable.printStackTrace();
		}
		return timeSeriesResult;
	}

	private Date parseDate(String dateStr) throws ParseException {
		Date date = DATE_PARSER.parse(dateStr);
		if (dateStr.length() > 10)
			date = DATE_TIME_PARSER.parse(dateStr);
		return date;
	}

	private Map<Date, StockTimeSeries> getDateObjectMap(JsonNode node) {
		Map<Date, StockTimeSeries> timeSeriesMap = new TreeMap<>();
		node.fields().forEachRemaining(nodeEntry -> {

			if (!nodeEntry.getKey().equals(MetaData.META_DATA_RESPONSE_KEY)) {
				nodeEntry.getValue().fields().forEachRemaining(timeSeriesEntry -> {
					try {
						timeSeriesMap.put(parseDate(timeSeriesEntry.getKey()), GlobalJsonParser.toObject(
								GlobalJsonParser.toJson(AlphaVantageResponse.sanitizeNodeKeys(timeSeriesEntry.getValue())), StockTimeSeries.class));
					} catch (IOException | ParseException e) {
						e.printStackTrace();
					}
				});
			}
		});
		return timeSeriesMap;
	}

}
