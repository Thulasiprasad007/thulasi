package com.test;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringMain {

	public static void main(String[] args) {
		ApplicationContext beanFactory=new ClassPathXmlApplicationContext("config.xml");
		FirstBean bh=(FirstBean)beanFactory.getBean("d");
	
		
		bh.display();
	}

}
