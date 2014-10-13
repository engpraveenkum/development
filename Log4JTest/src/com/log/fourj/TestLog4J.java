package com.log.fourj;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;


public class TestLog4J {
	
	private static Logger logger = Logger.getLogger(TestLog4J.class.getName());
	public static void main(String[] args) {
		logger.log(Level.INFO, "Hello logging");
		logger.log(Level.INFO, "Hello logging: {0}, {1}");
		
	}

}
