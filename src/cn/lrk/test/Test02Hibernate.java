package cn.lrk.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import cn.lrk.domain.Customer;

/**
 * 测试hibernate
 * @author eva
 *
 */
public class Test02Hibernate {

	public static void main(String[] args) {
		
		//读取配置文件
		Configuration config = new Configuration();
		config.configure();
		//获得SessionFactory
		SessionFactory factory = config.buildSessionFactory();
		//获取session
		Session session = factory.getCurrentSession();
		//开启事务
		Transaction tx =session.beginTransaction();
		//执行操作
		Customer customer = new Customer();
//		customer.setCustName("hibernate添加测试一");
//		session.save(customer);
		customer = session.get(Customer.class, 1L);
		System.out.println(customer);
		//提交/回滚事务
		tx.commit();
		//关闭资源
		factory.close();

	}

}
