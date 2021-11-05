package com.example.progettoVoli;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Airport {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer airportId;
	
	private String name;
	private String city;
	private String Nation;
	
	@OneToMany(mappedBy = "airport")
	private Flyght flyght;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getNation() {
		return Nation;
	}
	public void setNation(String nation) {
		Nation = nation;
	}
	
	

}
