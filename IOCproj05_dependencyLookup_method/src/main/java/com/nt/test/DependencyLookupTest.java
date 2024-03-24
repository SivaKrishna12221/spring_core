package com.nt.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.methodReplacer.StateBankOfIndia;
import com.nt.sbeans.DepedencyConfigurationClass;

public class DependencyLookupTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(DepedencyConfigurationClass.class);
		/*
		 * Cricket cri=ctx.getBean("cric",Cricket.class); cri.BattingTest();
		 */
		/*
		 * Bike b = ctx.getBean("bike",Bike.class); System.out.println(
		 * b.getBikeEngineCapacity());
		 */
		StateBankOfIndia sbi=ctx.getBean("sbi",StateBankOfIndia.class);
		Double intrest=sbi.calculateCompoundIntrest(100000d, 20d, 2);
		
		System.out.println("Compound intrest:"+intrest);
		}
}
