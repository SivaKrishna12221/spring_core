package com.nt.sbeans;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.nt")
public class AppConfig 
{
 @Bean(name="date")
 public LocalDate createDateTime()
 {
	 System.out.println("AppConfig.createDateTime()");
	 return LocalDate.now();
 }
}
