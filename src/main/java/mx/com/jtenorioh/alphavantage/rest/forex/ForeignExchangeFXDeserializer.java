package mx.com.jtenorioh.alphavantage.rest.forex;

import java.io.IOException;
import java.util.Date;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

import mx.com.jtenorioh.alphavantage.rest.api.response.AlphaVantageResponse;
import mx.com.jtenorioh.alphavantage.rest.model.ForeignExchangeFX;

public class ForeignExchangeFXDeserializer extends JsonDeserializer<ForeignExchangeFXResponse> {

	@Override
	public ForeignExchangeFXResponse deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)
			throws IOException, JsonProcessingException {
		ForeignExchangeFXResponse foreignExchangeResult = new ForeignExchangeFXResponse();
		ObjectCodec oc = jsonParser.getCodec();
		JsonNode node = oc.readTree(jsonParser);
		try {
			Map<Date, ForeignExchangeFX> foreignExchangeQuotes = AlphaVantageResponse.getDateObjectMap(node,
					ForeignExchangeFX.class);

			foreignExchangeResult.setForeignExchangeQuotes(foreignExchangeQuotes);
			foreignExchangeResult.setMetaData(AlphaVantageResponse.getMetaData(node));
		} catch (Throwable t) {
			t.printStackTrace();
		}

		return foreignExchangeResult;
	}
}