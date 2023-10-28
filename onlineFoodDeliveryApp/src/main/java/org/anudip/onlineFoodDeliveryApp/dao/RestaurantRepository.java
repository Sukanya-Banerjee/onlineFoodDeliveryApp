package org.anudip.onlineFoodDeliveryApp.dao;


import org.anudip.onlineFoodDeliveryApp.bean.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RestaurantRepository extends JpaRepository<Restaurant,String> {
	
	@Query("select count(restaurantId) from Restaurant")
	public int getRestaurantCount();

@Query("select restaurantId from Restaurant")
public List <String> getAllRestaurantIds();
}
