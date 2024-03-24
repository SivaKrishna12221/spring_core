package com.nt.client;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.annoconfig.AppConfig;

public class AnnotationConfigTestI18Internationlization {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your language:");
		String lang = sc.next();
		System.out.println("enter your location:");
		String loc = sc.next();
		Locale locale = new Locale(lang, loc);
		String msg1 = ctx.getMessage("wish.msg", new String[] {}, locale);
		String msg2 = ctx.getMessage("ask.msg", new String[] {}, locale);
		String msg3 = ctx.getMessage("bye.msg", new String[] {}, locale);
		System.out.println(msg1 + " " + msg2 + " " + msg3);

	}
}
