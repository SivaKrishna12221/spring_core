package com.nt.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan (basePackages="com.nt")
@PropertySource(value="com/nt/commons/oracle.properties")
// @ImportResource({"com/nt/commons/oracle.properties","com/nt/cfgs/ApplicationContext.xml"}) 
@ImportResource(value="com/nt/cfgs/ApplicationContext.xml")
public class AppConfig2 
{
 @Autowired
 private Environment envi;
 
  @Bean(name="ds")
  public DriverManagerDataSource createDMDS()
  {
	  DriverManagerDataSource ds=new DriverManagerDataSource();
	  ds.setDriverClassName(envi.getRequiredProperty("jdbc.driver"));
	//  ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
	  ds.setUrl(envi.getRequiredProperty("jdbc.url"));
	  ds.setUsername(envi.getRequiredProperty("jdbc.username"));
	  ds.setPassword(envi.getRequiredProperty("jdbc.password"));
	  return ds;
  }
}
