package cn.ecut.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.ecut.dao.CustomerDao;
import cn.ecut.po.Customer;

public class DaoTest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		ApplicationContext act=new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerDao customerDao=(CustomerDao) act.getBean("CustomerDao");
		Customer customer=customerDao.findCustomerById(1);
		System.out.println(customer);
	}

}
