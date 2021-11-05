package com.example.progettoVoli;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Flyght {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer flyghtId;
	
	//inserire tipo data
	@Column(nullable = false)
	private Integer departureDate;
	//inserire tipo data
	@Column(nullable = false)
	private Integer arrivalDate;
	
	@Column(nullable = false)
	private Integer airportDepartureId;
	@Column(nullable = false)
	private Integer airportArrivalId;
	@Column(nullable = false)
	private Integer tailCodeId;
	
	
	public Integer getTailCodeId() {
		return tailCodeId;
	}
	public void setTailCodeId(Integer tailCodeId) {
		this.tailCodeId = tailCodeId;
	}
	public Integer getAirportArrivalId() {
		return airportArrivalId;
	}
	public void setAirportArrivalId(Integer airportArrivalId) {
		this.airportArrivalId = airportArrivalId;
	}
	public Integer getAirportDepartureId() {
		return airportDepartureId;
	}
	public void setAirportDepartureId(Integer airportDepartureId) {
		this.airportDepartureId = airportDepartureId;
	}
	public Integer getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(Integer arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	public Integer getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(Integer departureDate) {
		this.departureDate = departureDate;
	}
	
	
	
}
