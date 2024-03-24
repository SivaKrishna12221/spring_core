package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.MilkSeller;
import com.nt.service.MilkServiceInterface;
@Controller("milkcontroller")
public class MilkControllerClass 
{    
	@Autowired
	 private MilkServiceInterface msi;
	 
	 public String processController(MilkSeller ms)throws Exception//here we can get all the model class objects and also connection
	 {
	   String result=msi.calculateAmount(ms);//here we will get net and gross salaries
	   return result;
}
}