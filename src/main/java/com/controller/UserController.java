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
		
	public void destroy() throws Exception {
		System.out.println("destroy()");
	}
	public void destroyMe() {
		System.out.println("destroyMe()");
	}
	
}
