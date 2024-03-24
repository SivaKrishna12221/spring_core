package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Customer;
import com.nt.service.ICustService;

@Controller("cust-controller")
public class CustomerController {

	@Autowired
	private ICustService custservice;

	public String saveCustDetails(Customer cust) throws Exception {
		int count = custservice.calculateBillamount(cust);
		if (count > 0) {
			return "Customer details are saved successfully";

		} else {
			return "failed to save cust details";
		}
	}

}
