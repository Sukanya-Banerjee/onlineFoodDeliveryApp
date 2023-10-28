package org.anudip.onlineFoodDeliveryApp.dao;


import org.anudip.onlineFoodDeliveryApp.bean.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BillRepository extends JpaRepository<Bill, Integer> {
	
	@Query("select count(serialNumber) from Bill")
	public int getBillCount();
}