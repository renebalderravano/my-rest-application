package com.myapplication.model;

import jakarta.persistence.*;

@Entity
@Table(name = "publication")
public class Publication {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "carName")
	private String carName;
	@Column(name = "price")
	private Double price;
	@Column(name = "agency")
	private String agency;
	@Column(name = "location")
	private String location;
	@Column(name = "photo")
	private String photo;
	@Column(name = "availableUnits")
	private Integer availableUnits;

	public Publication() {

	}

	public Publication(Integer id, String name, String city, String state, String photo, Integer availableUnits,
			boolean wifi, boolean laundry) {
		this.id = id;
		this.setCarName(name);
		this.setAgency(city);
		this.setLocation(state);
		this.setPhoto(photo);
		this.setAvailableUnits(availableUnits);

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getAgency() {
		return agency;
	}

	public void setAgency(String agency) {
		this.agency = agency;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
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

}
