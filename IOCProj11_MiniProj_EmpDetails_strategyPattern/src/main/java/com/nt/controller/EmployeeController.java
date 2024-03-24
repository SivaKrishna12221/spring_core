package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Employee;
import com.nt.service.IEmployeeService;

@Controller("empController")
public class EmployeeController {
	@Autowired
	private IEmployeeService iemp;

	public String processEmployee(Employee emp) throws Exception {
		String result = iemp.registerEmployee(emp);
		return result;
	}
}