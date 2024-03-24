package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nt.dao.IcustomerDAO;
import com.nt.model.Customer;

@Service("custService")
public class CustomerMgmtServiceImpl implements IcustomerMgmtService {
	@Autowired
	private IcustomerDAO custDAO;

	@Override
	public String registerCustomer(Customer customer) throws Exception {
		int count = 0;
		double discountAmount = (customer.getBillamount() * (customer.getDiscount() / 100.0));
		double finalAmount = (customer.getBillamount() - discountAmount);
		//set final amount to model class object
		customer.setFinalamount(finalAmount);
		count = custDAO.insert(customer);

		return count == 0 ? "registered failed"
				: "customer registered having bill amount::" + "BillAmount"

						+ customer.getBillamount() + ",discount::" + customer.getDiscount() + " ,final amount"
						+ customer.getFinalamount();

	}
}
