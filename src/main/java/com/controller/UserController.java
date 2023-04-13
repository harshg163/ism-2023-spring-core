package com.controller;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserController implements InitializingBean, DisposableBean{
	private String name;
	private Integer salary;
	
	public UserController() {
	}
	
	public void init() {
		System.out.println("init()");
	}
	
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet()");
		
	}
	
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
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("Spring.xml"); 
		System.out.println(container);
		
		UserController uc1 = container.getBean("userController", UserController.class);
		UserController uc2 = container.getBean("userController", UserController.class);
		UserController uc3 = container.getBean("userController", UserController.class);
		 
		System.out.println(uc1);
		System.out.println(uc2);
		System.out.println(uc3);
		
		System.out.println(uc1.getName());
		System.out.println(uc1.getSalary());
		
		
		container.registerShutdownHook();
	}
		
	public void destroy() throws Exception {
		System.out.println("destroy()");
	}
	public void destroyMe() {
		System.out.println("destroyMe()");
	}
	
}
