package com.nt.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("fp")
public class Flipkart
{
 @Autowired
 //@Value("${ekart}")
 //@Qualifier("${courier.id}") invalid we cant pass place holder properties directly
 //@Qualifer(@Value("${courier.id}"))invalid becoz @value can not be placed inside the qualifier
// @Qualifier(id)//invalid becoz we can't pass id
@Qualifier("ekart")
 private Courier courier;//HAS-A property
 
 public void setCourier(Courier courier)
 {
	 System.out.println("Flipkart.setCourier()");
	 this.courier=courier;
 }
 //business method
 public String shopping(String items[],double price[])
 {
	 double billAmount=0.0;
	 for(double p:price)
	 {
		 billAmount+=p;
	 }
	 //generating an id;
	 int oid =new Random().nextInt(1000);
	 String msg=courier.deliver(oid);
	 return Arrays.toString(items)+" are purchased having prices"
	 		+  billAmount+"total "+msg;
	 
 }
}
