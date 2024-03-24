package com.nt.comp;

import java.util.Arrays;
import java.util.Random;
//target class
public final class Flipkart//final class rule 3
{
// HAS-A property
   private Courier courier;//rule2 (interface type referrence)
   public Flipkart()
   {
	   System.out.println("Flipkart.Flipkart()");
   }
   public void setCourier(Courier courier)
   {
	   System.out.println("Flipkart.setCourier()");
	   this.courier=courier;
   }
   //business method
   public String shopping(String items[],double prices[])
   {
	   //calc bill purpose
	   double billAmount=0.0;
	   for(double p:prices)
	   {
		   billAmount+=p;
	   }
	   //generator order id;
	   int oid=new Random().nextInt(10000);
	   String msg=courier.deliver(oid);
	   return Arrays.toString(items)+"have purchased having bill amount "+billAmount+"==>"+msg;
   }
   
}
