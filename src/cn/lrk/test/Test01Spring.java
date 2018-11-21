package cn.lrk.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.lrk.service.ICustomerService;

public class Test01Spring {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ICustomerService customerService = (ICustomerService) context.getBean("customerService");
		customerService.findAllCustomer();

	}

}
