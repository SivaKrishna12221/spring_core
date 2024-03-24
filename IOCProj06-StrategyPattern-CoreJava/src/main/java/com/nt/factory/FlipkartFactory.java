package com.nt.factory;

import com.nt.comp.BlueDart;
import com.nt.comp.Courier;
import com.nt.comp.DTDC;
import com.nt.comp.Flipkart;

//factory pattern
public class FlipkartFactory 
{
 public static Flipkart getInstance(String courierType)
 {
	 Courier courier=null;
	 if(courierType.equalsIgnoreCase("dtdc"))
	 {
		 courier=new DTDC();
	 }
	 else if(courierType.equalsIgnoreCase("blueDart"))
		 courier=new BlueDart();
	 else
		 throw new IllegalArgumentException("invalid couriertype");
	 //create target class object 
	 Flipkart fpkt =new Flipkart();
	 //assaign dependent class
	 fpkt.setCourier(courier);
	 return fpkt;
 }
}
