package mx.com.jtenorioh.alphavantage.rest.api.controller;

import java.lang.annotation.Retention;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import mx.com.jtenorioh.alphavantage.rest.cryptocurrencies.CryptocurreniesEnum;
import mx.com.jtenorioh.alphavantage.rest.forex.ForeignExhangeFXEnum;
import mx.com.jtenorioh.alphavantage.rest.model.Category;
import mx.com.jtenorioh.alphavantage.rest.model.Function;
import mx.com.jtenorioh.alphavantage.rest.sectorperformances.SectorEnum;
import mx.com.jtenorioh.alphavantage.rest.stocktimeseries.StockTimeSeriesEnum;
import mx.com.jtenorioh.alphavantage.rest.technicalindicator.TechnicalIndicatorEnum;

@Controller
public class HomeController {

	private static final Logger LOG = Logger.getLogger(HomeController.class);

	private RestTemplate restTemplate = new RestTemplate();

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String showDashboard(Model model) {
		List<Category> categories = getCategories();
		model.addAttribute("categories", categories);
		System.out.println("Se carga en sesion: " + categories.size());
		for (Function fun : getFunctionStockTimeSeries()) {
			System.out.println(fun.toString());
		}
		System.out.println("\n\n");
		for (Function fun : getForexFX()) {
			System.out.println(fun.toString());
		}
		return "home";
	}

	@RequestMapping(value = "/loadFunctions/{id}", method = RequestMethod.GET)
	public @ResponseBody List<Function> loadFunction(@PathVariable("id") int id) {
		List<Function> function = null;
		switch (id) {
		case 0:
			function = getFunctionStockTimeSeries();
			break;
		case 1:
			function = getForexFX();
			break;
		case 2:
			function = getCryptocurrenies();
			break;
		case 3:
			function = getTechnicalIndicator();
			break;
		case 4:
			function = getSector();
			break;
		default:
			return function;
		}
		return function;
	}

	private List<Category> getCategories() {
		List<Category> categories = new ArrayList<>();
		categories.add(new Category(0, "-- Select a categories --"));
		categories.add(new Category(1, "Stock Time Series Data"));
		categories.add(new Category(2, "Physical and Digital/Crypto Currencies"));
		categories.add(new Category(3, "Technical Indicators"));
		categories.add(new Category(4, "Sector Performances"));
		return categories;
	}

	public @ResponseBody List<Function> getFunctionStockTimeSeries() {
		List<Function> functions = new ArrayList<>();
		functions.add(new Function("NONE", "-- Select function --"));
		for (StockTimeSeriesEnum stockTimeSeries : StockTimeSeriesEnum.values()) {
			functions.add(new Function(stockTimeSeries.name(), stockTimeSeries.getFunction()));
		}
		return functions;
	}

	public @ResponseBody List<Function> getForexFX() {
		List<Function> functions = new ArrayList<>();
		functions.add(new Function("NONE", "-- Select function --"));
		for (ForeignExhangeFXEnum foreingExchangeFX : ForeignExhangeFXEnum.values()) {
			functions.add(new Function(foreingExchangeFX.name(), foreingExchangeFX.getFunction()));
		}
		return functions;
	}

	public @ResponseBody List<Function> getCryptocurrenies() {
		List<Function> functions = new ArrayList<>();
		functions.add(new Function("NONE", "-- Select function --"));
		for (CryptocurreniesEnum cryptocurrenies : CryptocurreniesEnum.values()) {
			functions.add(new Function(cryptocurrenies.name(), cryptocurrenies.getFunction()));
		}
		return functions;
	}

	public @ResponseBody List<Function> getTechnicalIndicator() {
		List<Function> functions = new ArrayList<>();
		functions.add(new Function("NONE", "-- Select function --"));
		for (TechnicalIndicatorEnum technicalIndicator : TechnicalIndicatorEnum.values()) {
			functions.add(new Function(technicalIndicator.name(), technicalIndicator.getFunction()));
		}
		return functions;
	}

	public @ResponseBody List<Function> getSector() {
		List<Function> functions = new ArrayList<>();
		functions.add(new Function("NONE", "-- Select function --"));
		for (SectorEnum sectorEnum : SectorEnum.values()) {
			functions.add(new Function(sectorEnum.name(), sectorEnum.getFunction()));
		}
		return functions;
	}
}
