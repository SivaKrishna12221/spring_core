package com.nt.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {

	@Autowired
	@Qualifier("ldttime")//if primary,@Qualifier and name type matching first priority Qualifier
	private LocalDateTime ldt;
	
	/* Setter method
	 * @Autowired public void setLdt(LocalDateTime ldt) { this.ldt=ldt; }
	 */
	/*// Constructor injection
	 * @Autowired public WishMessageGenerator(LocalDateTime ldt) { this.ldt=ldt; }
	 */
	/*//arbitary method injection
	 * @Autowired public void putLdt(LocalDateTime ldt) { this.ldt=ldt; }
	 */
	public String messageGenerator(String name)
	{
	int hour=	ldt.getHour();
	if(hour<12)
	{
		return "Good morning:"+name;
	}
	else if(hour<16)
	{
		return "Good afternoon:"+name;
	}
	else if(hour<18)
	{
		return "Good Evening:"+name;
	}
	else
	{
		return "Good Night:"+name;
	}
}
}
