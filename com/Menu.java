package com;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity(name = "menu")
public class Menu {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer menuId;
	@Column(name="menu_name")
	String menuName;
	@Column(name="menu_price")
	double menuPrice;
	@Column(name="menu_status")
	String menuStatus;
	@Column(name="menu_image")
	String menuImage;
	@Column(name="restaurant_id")
	private Integer restaurantId;
	
	@Column(name="cuisine_id")
	private Integer cuisineId;

	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Menu(Integer menuId, String menuName, double menuPrice, String menuStatus, String menuImage,
			Integer restaurantId, Integer cuisineId) {
		super();
		this.menuId = menuId;
		this.menuName = menuName;
		this.menuPrice = menuPrice;
		this.menuStatus = menuStatus;
		this.menuImage = menuImage;
		this.restaurantId = restaurantId;
		this.cuisineId = cuisineId;
	}

	public Integer getMenuId() {
		return menuId;
	}

	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public double getMenuPrice() {
		return menuPrice;
	}

	public void setMenuPrice(double menuPrice) {
		this.menuPrice = menuPrice;
	}

	public String getMenuStatus() {
		return menuStatus;
	}

	public void setMenuStatus(String menuStatus) {
		this.menuStatus = menuStatus;
	}

	public String getMenuImage() {
		return menuImage;
	}

	public void setMenuImage(String menuImage) {
		this.menuImage = menuImage;
	}

	public Integer getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(Integer restaurantId) {
		this.restaurantId = restaurantId;
	}

	public Integer getCuisineId() {
		return cuisineId;
	}

	public void setCuisineId(Integer cuisineId) {
		this.cuisineId = cuisineId;
	}

	@Override
	public String toString() {
		return "Menu [menuId=" + menuId + ", menuName=" + menuName + ", menuPrice=" + menuPrice + ", menuStatus="
				+ menuStatus + ", menuImage=" + menuImage + ", restaurantId=" + restaurantId + ", cuisineId="
				+ cuisineId + "]";
	}

	

}
