package com.nt.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("emp")
public class Employee {
	private String name;
	private Integer id;
	private Double salary;
	private Address address;
	private Organization orgarnization;

	public Employee(String name, Integer id, Double salary, Address address, Organization orgarnization) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.address = address;
		this.orgarnization = orgarnization;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}
	@Autowired
	public void setOrgarnization(Organization orgarnization) {
		this.orgarnization = orgarnization;
	}
	
	public String getName() {
		return name;
	}
	public Integer getId() {
		return id;
	}
	public Double getSalary() {
		return salary;
	}
	public Address getAddress() {
		return address;
	}
	public Organization getOrgarnization() {
		return orgarnization;
	}
	
}
