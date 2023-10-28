package org.anudip.onlineFoodDeliveryApp.bean;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bill {
	@Id
	private Integer serialNumber ;
	private Integer orderNo; 
	private Integer customerId; 
	private String restaurantId;
	private String itemName; 
	private Integer quantity;
	private Double amount;
	private Date orderDate;
	private String orderStatus;
	private String paymentStatus;
	public Bill() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bill(Integer serialNumber, Integer orderNo, Integer customerId, String restaurantId, String itemName,
			Integer quantity, Double amount, Date orderDate, String orderStatus, String paymentStatus) {
		super();
		this.serialNumber = serialNumber;
		this.orderNo = orderNo;
		this.customerId = customerId;
		this.restaurantId = restaurantId;
		this.itemName = itemName;
		this.quantity = quantity;
		this.amount = amount;
		this.orderDate = orderDate;
		this.orderStatus = orderStatus;
		this.paymentStatus = paymentStatus;
	}
	
	public Bill(Integer serialNumber) {
		super();
		this.serialNumber = serialNumber;
	}
	public Integer getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(Integer serialNumber) {
		this.serialNumber = serialNumber;
	}
	public Integer getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(Integer orderNo) {
		this.orderNo = orderNo;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(String restaurantId) {
		this.restaurantId = restaurantId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	@Override
	public String toString() {
		return "serialNumber=" + serialNumber + ", orderNo=" + orderNo + ", customerId=" + customerId
				+ ", restaurantId=" + restaurantId + ", itemName=" + itemName + ", quantity=" + quantity + ", amount="
				+ amount + ", orderDate=" + orderDate + ", orderStatus=" + orderStatus + ", paymentStatus="
				+ paymentStatus;
	}
	
}