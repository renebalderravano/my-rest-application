package com.myapplication.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Housing_Location")
public class HousingLocation {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "name")
	private String name;
	@Column(name = "city")
	private String city;
	@Column(name = "state")
	private String state;
	@Column(name = "photo")
	private String photo;
	@Column(name = "availableUnits")
	private Integer availableUnits;
	@Column(name = "wifi")
	private boolean wifi;
	@Column(name = "laundry")
	private boolean laundry;
	
	public HousingLocation() {
		
	}
	
public HousingLocation( Integer id, 
 String name,
 String city,
 String state,
 String photo,
 Integer availableUnits,
 boolean wifi,
 boolean laundry) {
	this.id = id;
	this.name = name;
	this.city = city;
	this.state = state;
	this.photo = photo;
	this.availableUnits =availableUnits;
	this.wifi = wifi;
	this.laundry = laundry;
		
	}
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Integer getAvailableUnits() {
		return availableUnits;
	}

	public void setAvailableUnits(Integer availableUnits) {
		this.availableUnits = availableUnits;
	}

	public boolean isWifi() {
		return wifi;
	}

	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}

	public boolean isLaundry() {
		return laundry;
	}

	public void setLaundry(boolean laundry) {
		this.laundry = laundry;
	}
	
	

}
