package com.nt.sbeans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component("cric")
public class Cricket implements ApplicationContextAware{

	
	
	private ApplicationContext ctx;
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		this.ctx=applicationContext;
		
	}
	public void BattingTest()
	{
		/*
		 * AnnotationConfigApplicationContext ctx =new
		 * AnnotationConfigApplicationContext(DepedencyConfigurationClass.class);
		 */
	 Batting bat=ctx.getBean("bat",Batting.class);
	 int score=bat.getScore();
	 System.out.println("your score is:"+score);
	}
	
}
