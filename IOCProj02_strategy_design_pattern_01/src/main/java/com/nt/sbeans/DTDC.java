package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("dtdc")
public final class DTDC implements ICourierService//open for extension closed for modification .if you use final class kills the developing child class
{
@Override
public String services() {
  return "flipkart services uses DTDC services";
}
}
