package com.nt.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Import({ServiceConfig.class,ControllerConfig.class,PersistenceConfig.class})

public class AppConfig 
{

}
