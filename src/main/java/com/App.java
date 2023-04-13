package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.controller.UserController;

public class App 
{
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
}
