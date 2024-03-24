package com.nt.client;

import com.nt.comp.Flipkart;
import com.nt.factory.FlipkartFactory;

public class StrategyPatternTest
{
   public static void main(String[] args)
   {
	   //get target class obj (flipkart class obj) from factory
	Flipkart fpkt=FlipkartFactory.getInstance("dtdc");
    String result=fpkt.shopping(new String[] {"candles","flower","cake","wine"},new double[] {1000.3,2000.0,1000.0,3000.0});
    System.out.println(result);
}
}
