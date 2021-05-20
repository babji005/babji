package com;

public class MenuAndCuisine {
	
	Integer menuId;
	String menuName;
	double menuPrice;
	String menuImage;
	String menuStatus;
	Integer restaurantId;
	Integer cuisineId;
	String cuisineName;
	public MenuAndCuisine() {

	}
	
	public MenuAndCuisine(Integer menuId, String menuName, double menuPrice, String menuImage, String menuStatus,
			Integer restaurantId, Integer cuisineId, String cuisineName) {
		
		this.menuId = menuId;
		this.menuName = menuName;
		this.menuPrice = menuPrice;
		this.menuImage = menuImage;
		this.menuStatus = menuStatus;
		this.restaurantId = restaurantId;
		this.cuisineId = cuisineId;
		this.cuisineName = cuisineName;
		
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

	public String getMenuImage() {
		return menuImage;
	}

	public void setMenuImage(String menuImage) {
		this.menuImage = menuImage;
	}

	public String getMenuStatus() {
		return menuStatus;
	}

	public void setMenuStatus(String menuStatus) {
		this.menuStatus = menuStatus;
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
	public String getCuisineName() {
		return cuisineName;
	}

	public void setCuisineName(String cuisineName) {
		this.cuisineName = cuisineName;
	}

	

	@Override
	public String toString() {
		return "MenuAndCuisine [menuId=" + menuId + ", menuName=" + menuName + ", menuPrice=" + menuPrice
				+ ", menuImage=" + menuImage + ", menuStatus=" + menuStatus + ", restaurantId=" + restaurantId
				+ ", cuisineId=" + cuisineId + " , cuisineName=" + cuisineName + "]";
	}
	
	
	
	

}
