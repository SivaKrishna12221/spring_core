package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Customer;
import com.nt.service.IcustomerMgmtService;

@Controller("custController")
public class CustomerOperationController 
{
  @Autowired
  private IcustomerMgmtService service;
  public String  processCustomer(Customer cust)throws Exception
  {
	  String result=service.registerCustomer(cust);
	  return result;
  }
  
}
