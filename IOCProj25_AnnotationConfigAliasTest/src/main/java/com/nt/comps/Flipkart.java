package com.nt.comps;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("fpkt")
public class Flipkart
{
  
  //@Value("${courier.id}")//invalid here we can't assign ids to value
  
  @Autowired
 // @Qualifier("${ekart}")//invalid not use $ simble
  //Value("${ekart}")//invalid 
  @Qualifier("ekart")
  private Courier courier;//has a property /
  
  public String shopping(String items[],double price[])
  {
	  System.out.println("Flipkart.Shopping()");
	  double billamount=0;
	  for(double p:price)
	  {
		  billamount+=p; 
	  }
	  int oid=new Random().nextInt(1000);
	  String couriervalue=courier.deliver(oid);
	  return "you have purchased this items"+Arrays.toString(items)+" your billamount is:"+billamount+" your order is assaigned to "+couriervalue;
  }
  
}
