package com.project2.microservices.currentconvertionrateservice.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;




@Entity
public class ExchangeRates {
	@Id
	@GeneratedValue
	private int id;
	private String fromCountry;
	private String toCountry;
	private double exchangeRate;
	private String portNo;
	
	
	
	public String getPortNo() {
		return portNo;
	}


	public void setPortNo(String portNo) {
		this.portNo = portNo;
	}


	public ExchangeRates() {
		super();
	}
	
	
	public ExchangeRates(int id, String fromCountry, String toCountry, double exchangeRate, String portNo) {
		super();
		this.id = id;
		this.fromCountry = fromCountry;
		this.toCountry = toCountry;
		this.exchangeRate = exchangeRate;
		this.portNo = portNo;
	}

	@Override
	public String toString() {
		return "ExchangeRates [id=" + id + ", fromCountry=" + fromCountry + ", toCountry=" + toCountry
				+ ", exchangeRate=" + exchangeRate + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFromCountry() {
		return fromCountry;
	}
	public void setFromCountry(String fromCountry) {
		this.fromCountry = fromCountry;
	}
	public String getToCountry() {
		return toCountry;
	}
	public void setToCountry(String toCountry) {
		this.toCountry = toCountry;
	}
	public double getExchangeRate() {
		return exchangeRate;
	}
	public void setExchangeRate(double exchangeRate) {
		this.exchangeRate = exchangeRate;
	}
	
}
