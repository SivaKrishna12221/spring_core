package com.nt.clients;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.Flipkart;

public class StrategyDesignPatternTest1 {
	public static void main(String[] args) {
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext(
				"src/main/cfgs/com/nt/cfgs/applicationContext.xml");

		Flipkart fpkt = (Flipkart) ctx.getBean("fp");
		String result = fpkt.shopping(new String[] { "pyzama", "urtha", "atthar", "sweets" },
				new double[] { 500, 234, 343, 354 });
		System.out.println(result);

		ctx.close();

		/*
		 * Flipkart fpkt=Flipkart.getBean("fp",Flipkart.class); Flipkart
		 * fpkt2=Flipkart.getBean("fp",Flipkart.class);
		 * System.out.println(fpkt.hashCode()+" "+fpkt.hashCode());
		 * System.out.println(fpkt==fpkt2);
		 */
	}
}
