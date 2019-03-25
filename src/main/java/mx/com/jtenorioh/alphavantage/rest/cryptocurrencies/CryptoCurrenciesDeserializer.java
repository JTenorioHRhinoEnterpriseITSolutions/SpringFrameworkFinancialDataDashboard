package mx.com.jtenorioh.alphavantage.rest.cryptocurrencies;

import java.io.IOException;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

import mx.com.jtenorioh.alphavantage.rest.api.response.AlphaVantageResponse;
import mx.com.jtenorioh.alphavantage.rest.model.Cryptocurrenies;
import mx.com.jtenorioh.alphavantage.rest.util.GlobalJsonParser;

public class CryptoCurrenciesDeserializer extends JsonDeserializer<CryptoCurrenciesResponse> {

	@Override
	public CryptoCurrenciesResponse deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)
			throws IOException, JsonProcessingException {
		CryptoCurrenciesResponse cryptoCurrenciesResponse = new CryptoCurrenciesResponse();
		ObjectCodec oc = jsonParser.getCodec();
		JsonNode node = oc.readTree(jsonParser);
		try {
			Map<String, Object> sanitizedNodeKeys = AlphaVantageResponse
					.sanitizeNodeKeys(node.fields().next().getValue());
			Cryptocurrenies quote = GlobalJsonParser.toObject(GlobalJsonParser.toJson(sanitizedNodeKeys),
					Cryptocurrenies.class);
			cryptoCurrenciesResponse.setQuote(quote);
		} catch (Throwable t) {
			t.printStackTrace();
		}
		return cryptoCurrenciesResponse;
	}

}
