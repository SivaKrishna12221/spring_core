package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Customer;
import com.nt.service.IcustomerMgmtService;

@Controller("custController")
public class CustomerOperationController
{
	@Autowired
   private IcustomerMgmtService custService;
   public String processCustomer(Customer customer)throws Exception
   {
	   String result=custService.registerCustomer(customer);
	   return result;
   }
}
