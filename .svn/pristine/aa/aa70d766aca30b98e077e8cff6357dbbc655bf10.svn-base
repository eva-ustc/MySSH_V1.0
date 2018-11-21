package cn.lrk.web.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.lrk.domain.Customer;
import cn.lrk.service.ICustomerService;

public class CustomerAction extends ActionSupport implements ModelDriven<Customer> {
	private static final long serialVersionUID = 1L;

	private List<Customer> customers;
	
	private ICustomerService customerService;
	public void setCustomerService(ICustomerService customerService) {
		this.customerService = customerService;
	}
	private Customer customer = new Customer();
	@Override
	public Customer getModel() {
		return customer;
	}
	
/*	
 * 不导入struts2-spring-plugin-2.3.24.jar包时手动获取spring容器并注入customerService
 * 	public CustomerAction(){
		ServletContext application = ServletActionContext.getServletContext();
		ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(application);
		ICustomerService customerService = (ICustomerService) context.getBean("customerService");
		this.setCustomerService(customerService);
	}*/
	
	/**
	 * 获取添加客户页面
	 * @return
	 */
	public String addUICustomer() {
		
		return "addUICustomer";
	}
	/**
	 * 添加客户
	 * @return
	 */
	public String addCustomer() {
		customerService.saveCustomer(customer);
		return "addCustomer";
	}
	
	public String findAllCustomer() {
		customers = customerService.findAllCustomer();
		return "findAllCustomer";
	}


	
//====================getter and setter 存入值栈======================================================
	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	
}
