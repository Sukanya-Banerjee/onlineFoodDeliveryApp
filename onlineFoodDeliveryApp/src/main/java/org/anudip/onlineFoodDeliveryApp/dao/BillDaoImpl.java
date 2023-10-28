package org.anudip.onlineFoodDeliveryApp.dao;

import java.util.List;
import org.anudip.onlineFoodDeliveryApp.bean.Bill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Repository
public class BillDaoImpl implements BillDao {
	
	@Autowired
	private BillRepository repository;
	@Override
	public void saveBill(Bill bill) {
		repository.save(bill);

	}

	@Override
	public List<Bill> displayAllBill() {
		return repository.findAll();
	}

	@Override
	public Bill findABillById(Integer serialNumber) {
		return repository.findById(serialNumber).get();
	}
	
	
	@Override
	public Integer generateNewBillId() {
		Integer newId =0;
		int val = repository.getBillCount();
		newId=val+1;
		return newId;
	}
	
	

}