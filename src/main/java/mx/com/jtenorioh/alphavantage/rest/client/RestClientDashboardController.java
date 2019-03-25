package mx.com.jtenorioh.alphavantage.rest.client;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;



@Controller
@RequestMapping(value = "/api")
public class RestClientDashboardController {
	private static final Logger LOG = Logger.getLogger("controller");

	private RestTemplate restTemplate = new RestTemplate();

	@RequestMapping(value = "/alphavantage", method = RequestMethod.GET)
	public String getAlphavantage(Model model) {
		LOG.debug("Get Alphavange");

//		// Prepare acceptable media type
//		List<MediaType> acceptableMediaTypes = new ArrayList<MediaType>();
//		acceptableMediaTypes.add(MediaType.APPLICATION_XML);
//
//		// Prepare header
//		HttpHeaders headers = new HttpHeaders();
//		headers.setAccept(acceptableMediaTypes);
//		HttpEntity<Person> entity = new HttpEntity<Person>(headers);
//
//		// Send the request as GET
//		try {
//			ResponseEntity<PersonList> result = restTemplate.exchange(
//					"https://www.alphavantage.co/query?function=TIME_SERIES_INTRADAY&symbol=MSFT&interval=5min&apikey=demo",
//					HttpMethod.GET, entity, PersonList.class);
//			// Add to model
//			model.addAttribute("alphavantage", result.getBody().getData());
//
//		} catch (Exception e) {
//			logger.error(e);
//		}
//
//		// This will resolve to /WEB-INF/jsp/personspage.jsp
		return "alphavantage";
	}
}
