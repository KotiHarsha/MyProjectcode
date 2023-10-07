package com.org.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Addressinfo {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name = "idk")
	private int id;
	
	
	@Column(name = "st")
	private String state;
	@Column(name = "ci")
	private String city;
	@Column(name = "str")
	private String street;
	
	public Addressinfo() {
		
		// TODO Auto-generated constructor stub
	}

	public Addressinfo(String state, String city, String street) {
		super();
		this.state = state;
		this.city = city;
		this.street = street;
	}


	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}	
}