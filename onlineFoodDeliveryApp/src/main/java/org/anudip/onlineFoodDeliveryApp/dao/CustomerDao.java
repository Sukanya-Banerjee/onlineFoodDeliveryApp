package org.anudip.onlineFoodDeliveryApp.dao;

import java.util.List;
import org.anudip.onlineFoodDeliveryApp.bean.Customer;

public interface CustomerDao {

		public void saveCustomer(Customer customer); // store new course

		public List<Customer> displayAllCustomer();

		public Customer findACustomerById(Integer customerId);

		public Integer generateNewCustomerId();

		
}