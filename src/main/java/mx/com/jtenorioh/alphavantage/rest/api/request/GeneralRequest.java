package mx.com.jtenorioh.alphavantage.rest.api.request;

public interface GeneralRequest {

	public static String URL_QUERY = "https://www.alphavantage.co/query?";

	public String queryParameters(String function);
}
