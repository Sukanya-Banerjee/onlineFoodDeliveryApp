package org.anudip.onlineFoodDeliveryApp.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	private Integer customerId;
	private String customerName;
	private String address; 
	private Long contactNumber;
	private String email;
	private String status;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Customer(Integer customerId) {
		super();
		this.customerId = customerId;
	}

	public Customer(Integer customerId, String customerName, String address, Long contactNumber, String email,
			String status) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.address = address;
		this.contactNumber = contactNumber;
		this.email = email;
		this.status = status;
	}
	
	

	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "customerId=" + customerId + ", customerName=" + customerName + ", address=" + address
				+ ", contactNumber=" + contactNumber + ", email=" + email + ", status=" + status;
	}
}