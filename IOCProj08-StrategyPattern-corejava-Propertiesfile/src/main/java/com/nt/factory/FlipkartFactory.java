package com.nt.factory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class FlipkartFactory {
	private static Properties props;
	static {
		System.out.println("FlipkartFactory.enclosing_method()");

		try {
			//locate properties file through stream
			InputStream is = new FileInputStream("");
			//load properties file content to java.util.properties class obj
			props = new Properties();
			props.load(is);

		} //try
		catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static FlipkartFactory getInstance() throws Exception {
		System.out.println("FlipkartFactory.getInstance()");
		//get Dependent class name
		return null;

	}
}