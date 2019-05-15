package com.cns.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cns.beans.Person;

public class PNameSpaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctxt=new ClassPathXmlApplicationContext("com/cns/cfg/Beans.xml");
		Person person=ctxt.getBean("p",Person.class);
		
		System.out.println(person);
		

	}

}
