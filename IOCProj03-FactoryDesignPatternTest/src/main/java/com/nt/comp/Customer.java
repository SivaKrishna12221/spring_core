package com.nt.comp;

public class Customer extends Person
{
 private int txid;
 private double billAmount;
 public Customer(String name,String address,AadharDetails aadhar,int txid,double billAmount)
 {
	 super(name,address,aadhar);
	 this.billAmount=billAmount;
	 this.txid=txid;
	 System.out.println("Customer.Customer()");
 }
}
