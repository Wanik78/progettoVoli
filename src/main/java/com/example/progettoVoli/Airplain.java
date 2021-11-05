package com.example.progettoVoli;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Airplain {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer tailCode;
	
	@Column(nullable = false)
	private String model;
	
	@Column(nullable = false)
	private Integer seats;
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Integer getSeats() {
		return seats;
	}
	public void setSeats(Integer seats) {
		this.seats = seats;
	}
	
	
	
	
	

}
