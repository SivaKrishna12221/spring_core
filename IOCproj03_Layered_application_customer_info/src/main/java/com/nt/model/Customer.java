package com.nt.model;

public class Customer {

	public Integer getCustId() {
		return custId;
	}
	public void setCustId(Integer custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Double getDiscount() {
		return discount;
	}
	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	public Double getFinalBill() {
		return finalBill;
	}
	public void setFinalBill(Double finalBill) {
		this.finalBill = finalBill;
	}
	private Integer custId;
	public Customer(Integer custId, String custName, Double amount, Double discount) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.amount = amount;
		this.discount = discount;
		
	}
	private String custName;
	private Double amount;
	private Double discount;
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", amount=" + amount + ", discount=" + discount
				+ ", finalBill=" + finalBill + "]";
	}
	private Double finalBill;
}
