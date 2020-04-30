package com.log4j.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {
private static Logger log = LogManager.getLogger(Log4jDemo.class);
 public static void main(String[] args) {
	System.out.println("\n       Hello Log4j             \n");
	log.trace("this is trace message");
	log.info("this is information");
	log.error("this is error message");
	log.warn("this is warn message");
	log.fatal("this is fatal message");
	System.out.println("\n  completed");
}
}
