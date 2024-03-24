package com.nt.sbeans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("bd")
@Primary
public class Bludart implements ICourierService{

	@Override
	public String services() {
		return "flipkart using bludart services";
	}
}
