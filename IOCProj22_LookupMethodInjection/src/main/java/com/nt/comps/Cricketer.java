package com.nt.comps;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@Component("cric")
@PropertySource(value="com/nt/commons/playerInfo.properties")
public abstract class Cricketer 
{
  
  
  @Value("${player.name}")
  private String name;
  @Value("${player.jersyno}")
  private int jersyno;
  @Lookup
  public abstract CricketBat getBat();
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
 
  public void batting()
  {
	 System.out.println("Cricketer.batting()");
	 //ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	CricketBat bat=getBat();//dependent class object
	 int runs=bat.score();
	 System.out.println("The player "+name+" having jersyno "+jersyno+" has scored "+runs+" runs");
	 
  }
  
	/* Inmemory proxy classs
	 * public class cricketer$$CGLIBProxy extends Cricketer implements
	 * ApplicationContextAware { public ApplicationContext ctx; public void
	 * setApplicationContext(ApplicationContext ctx) {
	 * 
	 * this.ctx=ctx; } 
	 * public CricketBat getBat() 
	 * { Cricketer bat=ctx.getBean("cric",Cricketer.class); 
	 * return bat;
	 * 
	 * } }
	 */
  
 
}
