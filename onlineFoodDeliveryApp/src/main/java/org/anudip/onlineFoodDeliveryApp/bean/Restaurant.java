package org.anudip.onlineFoodDeliveryApp.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Restaurant {
	@Id
	private String restaurantId;
	private String restaurantName;
	private String restaurantType;
	public Restaurant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Restaurant(String restaurantId, String restaurantName, String restaurantType) {
		super();
		this.restaurantId = restaurantId;
		this.restaurantName = restaurantName;
		this.restaurantType = restaurantType;
	}
	
	public Restaurant(String restaurantId) {
		super();
		this.restaurantId = restaurantId;
	}
	public String getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(String restaurantId) {
		this.restaurantId = restaurantId;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public String getRestaurantType() {
		return restaurantType;
	}
	public void setRestaurantType(String restaurantType) {
		this.restaurantType = restaurantType;
	}
	@Override
	public String toString() {
		return "restaurantId=" + restaurantId + ", restaurantName=" + restaurantName + ", restaurantType="
				+ restaurantType;
	} 
	
	
	
}