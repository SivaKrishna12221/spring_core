package com.nt.comp;

public class Customer extends Person
{
 private int txid;
 private double billamount;
 public Customer(String name,String address,AadharDetails  aadhar,int txid,double billamount)
 {
	
	 super(name,address,aadhar);
	 System.out.println("Customer.5:param constructor");
	 this.txid=txid;
	 this.billamount=billamount;
	 
	 
 }
@Override
public String toString() {
	return super.toString()+"+Customer [txid=" + txid + ", billamount=" + billamount + "]";
}
}
