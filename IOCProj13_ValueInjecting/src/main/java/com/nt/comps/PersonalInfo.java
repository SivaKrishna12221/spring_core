package com.nt.comps;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("pinfo")
public class PersonalInfo 
{
 @Value("${per.name}")
 private String name;
 @Value("${per.age}")
 private Integer age;
 @Value("${per.addres}")
 private String address;
 
 //injecting the direct values
 @Value("500038")
 private Long pincode;
 //Injecting system property values
 @Value("${os.name}")
 private String osName;
 @Value("${os.version}")
 private String osVersion;
 //Injecting env variable values
 @Value("${path}")
 private String pathData;
 
 public String toString()
 {
	 return "PersonalInfo[name="+name+"age:"+age+"address"+address+""
	 		+ "pincode:"+pincode+"osName:"+osName+"osVersion:"+osVersion+""
	 		+"pathdata"+pathData+"]";
			 
 }
 
}
