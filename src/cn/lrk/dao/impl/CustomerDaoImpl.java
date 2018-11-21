package cn.lrk.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import cn.lrk.dao.ICustomerDao;
import cn.lrk.domain.Customer;
/**
 * 客户持久层实现类
 * @author eva
 *
 */
public class CustomerDaoImpl extends HibernateDaoSupport implements ICustomerDao {

	@Override
	public List<Customer> findAllCustomer() {
	
		
		return (List<Customer>) getHibernateTemplate().find("from Customer");
	}

	@Override
	public void saveCustomer(Customer customer) {
	
		getHibernateTemplate().save(customer);

	}

}
