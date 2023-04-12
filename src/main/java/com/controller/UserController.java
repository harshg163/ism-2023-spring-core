package com.controller;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserController {
	private String name;
	private Integer salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("Spring.xml"); 
		UserController uc = classPathXmlApplicationContext.getBean("userController", UserController.class);
		
		System.out.println(uc.getName());
		System.out.println(uc.getSalary());
		
		classPathXmlApplicationContext.close();
	}
}
