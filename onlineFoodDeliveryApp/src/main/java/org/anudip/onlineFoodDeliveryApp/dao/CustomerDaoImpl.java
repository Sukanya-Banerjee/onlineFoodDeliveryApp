package org.anudip.onlineFoodDeliveryApp.dao;

import java.util.List;

import org.anudip.onlineFoodDeliveryApp.bean.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Repository
public class CustomerDaoImpl implements CustomerDao {
	@Autowired
	private CustomerRepository repository;
	
	@Override
	public void saveCustomer(Customer customer) {
		repository.save(customer);

	}

	@Override
	public List<Customer> displayAllCustomer() {
		return repository.findAll();
		
	}

	@Override
	public Customer findACustomerById(Integer customerId) {
		return repository.findById(customerId).get();
	}
	

	@Override
	public Integer generateNewCustomerId() {
		Integer newId =0;
		int val = repository.getCustomerCount();
		if (val == 0)
			newId = 1001;
		else if(val>0)
		{
			newId=1000+(val+1);
			
		}
		return newId;
	}

	
	

}