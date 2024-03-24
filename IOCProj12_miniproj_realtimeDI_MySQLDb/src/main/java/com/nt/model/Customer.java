package com.nt.model;

public class Customer {
	private int cno;
	private String cname;
	private String address;
	private double billamount;
	private double discount;
	private double finalamount;

	public int getCno() {
		return cno;
	}

	public void setCno(int cno) {
		this.cno = cno;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getBillamount() {
		return billamount;
	}

	public void setBillamount(double billamount) {
		this.billamount = billamount;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getFinalamount() {
		return finalamount;
	}

	public void setFinalamount(double finalamount) {
		this.finalamount = finalamount;
	}

}
