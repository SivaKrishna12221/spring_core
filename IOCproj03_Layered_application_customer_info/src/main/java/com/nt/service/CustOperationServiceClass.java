package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IDoaClass;
import com.nt.model.Customer;
@Service("cust-service")
public class CustOperationServiceClass implements ICustService {

	@Autowired
	private IDoaClass dao;
	@Override
	public int calculateBillamount(Customer cust) throws Exception {
		Double tamount=cust.getAmount()-(cust.getAmount()*cust.getDiscount()/100);
		cust.setFinalBill(tamount);
		int num=dao.saveCustDetails(cust);
		if(num>0)
		{
		  return num;
		}
		else return 0;
	}

}
