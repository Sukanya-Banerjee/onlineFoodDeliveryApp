package org.anudip.onlineFoodDeliveryApp.dao;
import java.util.List;
import org.anudip.onlineFoodDeliveryApp.bean.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Repository
public class RestaurantDaoImpl implements RestaurantDao {
	
	@Autowired
	private RestaurantRepository repository;
	
	@Override
	public void saveRestaurant(Restaurant restaurant) {
		repository.save(restaurant);
		}

	@Override
	public List<Restaurant> displayAllRestaurant() {
		
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Restaurant findARestaurantById(String restaurantId) {
		// TODO Auto-generated method stub
		return repository.findById(restaurantId).get();
	}

	@Override
	public String generateNewRestaurantId() {
		String newId = "R";
		int val = repository.getRestaurantCount();
		if (val == 0)
			newId =newId+1001;
		else if (val>0)
			newId=newId+(val+1+1000);
		return newId;
	}

	@Override
	public List <String> getAllRestaurantIds(){
		return repository.getAllRestaurantIds();
	

	}

}