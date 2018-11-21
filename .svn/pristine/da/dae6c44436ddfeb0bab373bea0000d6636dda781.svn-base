package cn.lrk.service.impl;

import java.util.List;

import cn.lrk.dao.ICustomerDao;
import cn.lrk.domain.Customer;
import cn.lrk.service.ICustomerService;
/**
 * 客户的业务层实现类
 * @author eva
 *
 */
public class CustomerServiceImpl implements ICustomerService {

	private ICustomerDao customerDao;
	public void setCustomerDao(ICustomerDao customerDao) {
		this.customerDao = customerDao;
	}
	
	@Override
	public List<Customer> findAllCustomer() {
		
		return customerDao.findAllCustomer();
	}

	@Override
	public void saveCustomer(Customer customer) {

		customerDao.saveCustomer(customer);

	}

}
