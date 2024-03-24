package com.nt.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages="com.nt")
@ImportResource ( locations="com/nt/cfgs/ApplicationContext.xml")//it is for connection service oracle dao //from this we will properties also .through AC.xml
public class AppConfig 
{
	@Value("${jdbc.driver}")
	private String driver;
	
	@Value("${jdbc.url}")
	private String url;
	
	@Value("${jdbc.username}")
	private String uname;
	
	@Value("${jdbc.password}")
	private String pword;
	
	@Bean(name="hkds")
	public HikariDataSource createHkDS()
	{
	   HikariDataSource hkds=new HikariDataSource();
	   hkds.setDriverClassName(driver);
	   hkds.setJdbcUrl(url);
	   hkds.setUsername(uname);
	   hkds.setPassword(pword);
	   return hkds;
	}
}//it is working with hikaridatasource 

