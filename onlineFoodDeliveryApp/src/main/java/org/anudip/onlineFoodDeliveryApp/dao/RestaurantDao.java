package org.anudip.onlineFoodDeliveryApp.dao;

import java.util.List;

import org.anudip.onlineFoodDeliveryApp.bean.Restaurant;

public interface RestaurantDao {

			public void saveRestaurant(Restaurant restaurant); // store new course

			public List<Restaurant> displayAllRestaurant();

			public Restaurant findARestaurantById(String restaurantId);

			public String generateNewRestaurantId();

			//public void deleteRestaurantById(String restaurantId);
			public List <String> getAllRestaurantIds();
		}

