package com.nt.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages="com/nt/dao")
@PropertySource(value="com/nt/commons/jdbc.properties")
public class PersistenceConfig 
{

	@Autowired
   private Environment envi;
   @Bean(name="hkds")
    public HikariDataSource createHKDS()
    {
	   HikariDataSource hkds=new HikariDataSource();
	   hkds.setDriverClassName(envi.getRequiredProperty("jdbc.driver"));
	   hkds.setJdbcUrl(envi.getRequiredProperty("jdbc.url"));
	   
	   hkds.setUsername(envi.getRequiredProperty("jdbc.username"));
	   
	   hkds.setPassword(envi.getRequiredProperty("jdbc.password"));
	   return hkds;
    }
}
