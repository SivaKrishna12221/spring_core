package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.Flipkart;

public class StrategyDesignTest01 {

	 public static void main(String[] args) {
		//FileSystemXmlApplicationContext  ctx= new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		 //relative path locating configuration file from the current location .."com/nt//.."
		 //obsolute path locating config file from root directry like "D:/spring....appp"
		ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");//locating config file from the directories and jarfiles
		Flipkart flip= ctx.getBean("fkart",Flipkart.class);
		String result=flip.flipkartUsingServices(new String[] {"mobiles","laptap","bike"} ,new Double[] {23000d,35000d,2000d});
		System.out.println(result);
	}
}
