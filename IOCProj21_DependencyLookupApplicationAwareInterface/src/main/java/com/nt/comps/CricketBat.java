package com.nt.comps;

import java.util.Random;

import org.springframework.stereotype.Component;
@Component("bat")
public class CricketBat
{
  public CricketBat()
  {
	  System.out.println("CricketBat.CricketBat()");
  }
  public int score()
  {
	  return new Random().nextInt(200);
  }
}
