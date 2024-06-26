package com.nt.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages="com.nt.service")
@ImportResource("com/nt/cfgs/ApplicationContext.xml")
public class ServiceConfig
{
  
}
