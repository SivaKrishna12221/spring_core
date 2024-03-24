package com.nt.client;

import java.util.Locale;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class I18InternationalisationTest 
{
  public static void main(String[] args) {
	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/ApplicationContext.xml");
	Locale locale=new Locale(args[0],args[1]);//locale,language
	String msg1=ctx.getMessage("wish.msg", new String[]{},locale);//key value,one string array is created,locale
	String msg2=ctx.getMessage("wish2.msg",new String[]{},locale);
	String msg3=ctx.getMessage("bye.msg",new String[]{},locale);
	System.out.println(msg1+" ,"+msg2+", "+msg3);
	
	
	
}
}
