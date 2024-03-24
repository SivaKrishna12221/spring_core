package com.nt.client;

import com.nt.comp.Vehicle;
import com.nt.factory.VehicleFactory;

public class StrategyPatternTest2 
{
  public static void main(String[] args) {
	Vehicle vcle=VehicleFactory.getInstance("d_engine");
	String result=vcle.purchase(new String[] {"audi","nano","safari","suziki"},
			new double[] {123000,233233,34343454,34343});
	System.out.println(result);
}
} 
