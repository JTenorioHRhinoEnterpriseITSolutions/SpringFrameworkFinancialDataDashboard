package mx.com.jtenorioh.alphavantage.rest.api.response;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.fasterxml.jackson.databind.JsonNode;

import mx.com.jtenorioh.alphavantage.rest.util.GlobalJsonParser;

public class AlphaVantageResponse {
	private static final String REMOVE_NUMBER_REGEX = "\\d*.\\s(.*)";

	private static final SimpleDateFormat DATE_TIME_PARSER = new SimpleDateFormat("yyyy-MM-dd HH:mm:SS");
	private static final SimpleDateFormat DATE_PARSER = new SimpleDateFormat("yyyy-MM-dd");

	public static Map<String, Object> sanitizeNodeKeys(JsonNode jsonNode) {
		Map<String, Object> sanitizedNodes = new HashMap<>();
		jsonNode.fields().forEachRemaining((node) -> {
			String regexMatch = getMatch(REMOVE_NUMBER_REGEX, node.getKey());
			if (regexMatch != null) {
				sanitizedNodes.put(regexMatch, node.getValue());
			} else {
				sanitizedNodes.put(node.getKey(), node.getValue());
			}
		});
		return sanitizedNodes;
	}

	public static MetaData getMetaData(JsonNode node) throws IOException {
		Map<String, Object> sanitizedNodes = sanitizeNodeKeys(node.get(MetaData.META_DATA_RESPONSE_KEY));
		return GlobalJsonParser.toObject(GlobalJsonParser.toJson(sanitizedNodes), MetaData.class);
	}

	public static <T> Map<Date, T> getDateObjectMap(JsonNode node, Class<T> resultObject) {
		Map<Date, T> dateObjMap = new TreeMap<>();
		node.fields().forEachRemaining(nodeEntry -> {

			if (!nodeEntry.getKey().equals(MetaData.META_DATA_RESPONSE_KEY)) {
				nodeEntry.getValue().fields().forEachRemaining(timeSeriesEntry -> {
					try {
						dateObjMap.put(parseDate(timeSeriesEntry.getKey()), GlobalJsonParser.toObject(
								GlobalJsonParser.toJson(sanitizeNodeKeys(timeSeriesEntry.getValue())), resultObject));
					} catch (IOException | ParseException e) {
						e.printStackTrace();
					}
				});
			}
		});
		return dateObjMap;
	}

	private static Date parseDate(String dateStr) throws ParseException {
		Date date = DATE_PARSER.parse(dateStr);
		if (dateStr.length() > 10)
			date = DATE_TIME_PARSER.parse(dateStr);
		return date;
	}

	public static String getMatch(String regex, String toMatch) {
		final Pattern pattern = Pattern.compile(regex);
		final Matcher matcher = pattern.matcher(toMatch);
		String match = null;
		if (matcher.matches())
			match = matcher.group(1);
		return match;
	}
}
