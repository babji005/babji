package com;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "restaurant")
public class Restaurant {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer restaurantId;
	@Column(name="restaurant_name")
	String restaurantName;
	@Column(name="restaurant_location")
	String restaurantLocation;
	@Column(name="cuisine_id")
	Integer cuisineId;
	public Restaurant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Restaurant(Integer restaurantId, String restaurantName, String restaurantLocation, Integer cuisineId) {
		super();
		this.restaurantId = restaurantId;
		this.restaurantName = restaurantName;
		this.restaurantLocation = restaurantLocation;
		this.cuisineId = cuisineId;
	}
	public Integer getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(Integer restaurantId) {
		this.restaurantId = restaurantId;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public String getRestaurantLocation() {
		return restaurantLocation;
	}
	public void setRestaurantLocation(String restaurantLocation) {
		this.restaurantLocation = restaurantLocation;
	}
	public Integer getCuisineId() {
		return cuisineId;
	}
	public void setCuisineId(Integer cuisineId) {
		this.cuisineId = cuisineId;
	}
	@Override
	public String toString() {
		return "Restaurant [restaurantId=" + restaurantId + ", restaurantName=" + restaurantName
				+ ", restaurantLocation=" + restaurantLocation + ", cuisineId=" + cuisineId + "]";
	}
	
	

}
