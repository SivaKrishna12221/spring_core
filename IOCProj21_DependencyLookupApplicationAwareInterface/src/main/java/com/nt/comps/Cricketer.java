package com.nt.comps;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@Component("cric")
@PropertySource(value="com/nt/commons/playerInfo.properties")
public class Cricketer implements ApplicationContextAware
{
  private ApplicationContext ctx;
  
  @Value("${player.name}")
  private String name;
  @Value("${player.jersyno}")
  private int jersyno;
  public Cricketer()
  {
	  System.out.println("Cricketer.Cricketer()");
  }
  public void bowling()
  {
	  System.out.println("Cricketer.bowling()");
  }
  public void fielding()
  {
	  System.out.println("Cricketer.fielding()");
	  
  }
  public void wicketKeeping()
  {
	  System.out.println("Cricketer.wicketKeeping()");
	  
  }
  @Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.ctx=applicationContext;
		
	}
 public void batting()
  {
	 System.out.println("Cricketer.batting()");
	 //ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	 
	 CricketBat bat=ctx.getBean("bat",CricketBat.class);
	 int runs=bat.score();
	 System.out.println("The player "+name+" having jersyno "+jersyno+" has scored "+runs+" runs");
	 
  }

}