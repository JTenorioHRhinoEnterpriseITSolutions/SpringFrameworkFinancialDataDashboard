package mx.com.jtenorioh.alphavantage.rest.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Sector {

	@JsonProperty("Health Care")
	private double healthCare;

	@JsonProperty("Utilities")
	private double utilities;

	@JsonProperty("Energy")
	private double energy;

	@JsonProperty("Communication Services")
	private double comunicationServices;

	@JsonProperty("Information Technology")
	private double informationTechnology;

	@JsonProperty("Real Estate")
	private double realEstate;

	@JsonProperty("Materials")
	private double materials;

	@JsonProperty("Consumer Discretionary")
	private double consumerDiscretionary;

	@JsonProperty("Financials")
	private double financials;

	@JsonProperty("Consumer Staples")
	private double consumerStaples;

	@JsonProperty("Industrials")
	private double industrials;

	public Sector() {

	}

	public double getHealthCare() {
		return healthCare;
	}

	public void setHealthCare(double healthCare) {
		this.healthCare = healthCare;
	}

	public double getUtilities() {
		return utilities;
	}

	public void setUtilities(double utilities) {
		this.utilities = utilities;
	}

	public double getEnergy() {
		return energy;
	}

	public void setEnergy(double energy) {
		this.energy = energy;
	}

	public double getComunicationServices() {
		return comunicationServices;
	}

	public void setComunicationServices(double comunicationServices) {
		this.comunicationServices = comunicationServices;
	}

	public double getInformationTechnology() {
		return informationTechnology;
	}

	public void setInformationTechnology(double informationTechnology) {
		this.informationTechnology = informationTechnology;
	}

	public double getRealEstate() {
		return realEstate;
	}

	public void setRealEstate(double realEstate) {
		this.realEstate = realEstate;
	}

	public double getMaterials() {
		return materials;
	}

	public void setMaterials(double materials) {
		this.materials = materials;
	}

	public double getConsumerDiscretionary() {
		return consumerDiscretionary;
	}

	public void setConsumerDiscretionary(double consumerDiscretionary) {
		this.consumerDiscretionary = consumerDiscretionary;
	}

	public double getFinancials() {
		return financials;
	}

	public void setFinancials(double financials) {
		this.financials = financials;
	}

	public double getConsumerStaples() {
		return consumerStaples;
	}

	public void setConsumerStaples(double consumerStaples) {
		this.consumerStaples = consumerStaples;
	}

	public double getIndustrials() {
		return industrials;
	}

	public void setIndustrials(double industrials) {
		this.industrials = industrials;
	}

}
