package cn.lrk.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.lrk.domain.Customer;
import cn.lrk.service.ICustomerService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class Test03Spring_Hibernate {

	@Autowired
	private ICustomerService customerService;
	
	@Test
	public void testFindAll() {
		List<Customer> customers = customerService.findAllCustomer();
		for (Customer customer : customers) {
			System.out.println(customer);
		}
	}
	@Test
	public void testSave() {
		Customer customer = new Customer();
		customer.setCustName("Spring Hibernate 整合添加测试1");
		customerService.saveCustomer(customer);
	}
	
}
