package com.nt.model;

public class Address {

	
	private String city;
	private String state;
	private Long pincode;
	public Address(String city, String state, Long pincode) {
		super();
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public Long getPincode() {
		return pincode;
	}
	
	
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}
	
}
