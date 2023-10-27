package com.map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContext {
	public static void main(String[] args) {
		org.springframework.context.ApplicationContext app = new ClassPathXmlApplicationContext("map.xml");
		Questions que = (Questions) app.getBean("q");
		que.desplay();
	}
}
