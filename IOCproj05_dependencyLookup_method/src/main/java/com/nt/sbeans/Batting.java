package com.nt.sbeans;

import java.util.Random;

import org.springframework.stereotype.Component;
@Component("bat")
public class Batting {

	public int getScore()
	{
		return new Random().nextInt(100);
	}
}

