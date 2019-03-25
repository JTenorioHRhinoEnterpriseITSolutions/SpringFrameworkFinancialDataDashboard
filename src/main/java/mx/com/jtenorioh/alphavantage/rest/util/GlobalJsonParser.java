package mx.com.jtenorioh.alphavantage.rest.util;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

public class GlobalJsonParser {
	private final static ObjectMapper JSON_PARSER = new ObjectMapper();

	public static <T> T toObject(String json, Class<T> obj) throws IOException {
		return JSON_PARSER.readValue(json, obj);
	}

	public static String toJson(Object obj) throws JsonProcessingException {
		return JSON_PARSER.writeValueAsString(obj);
	}

	public static <T> void addDeserializer(Class<T> deserializationClass, JsonDeserializer<T> deserializer) {
		SimpleModule simpleModule = new SimpleModule();
		simpleModule.addDeserializer(deserializationClass, deserializer);
		JSON_PARSER.registerModule(simpleModule);
	}
}