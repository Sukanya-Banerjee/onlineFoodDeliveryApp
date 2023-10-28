package org.anudip.onlineFoodDeliveryApp.dao;
 import org.anudip.onlineFoodDeliveryApp.bean.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
	
	@Query("select count(customerId) from Customer")
	public int getCustomerCount();
}

