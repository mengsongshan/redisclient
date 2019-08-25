package com.mengmiao;

import java.awt.Frame;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * APP entry
 *
 */
public class App {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		Frame desktop = (Frame) context.getBean("desktop");

	}
}
