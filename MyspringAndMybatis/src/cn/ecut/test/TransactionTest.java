package cn.ecut.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.ecut.po.Customer;
import cn.ecut.servce.CustomerServce;

public class TransactionTest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
CustomerServce customerServce=applicationContext.getBean(CustomerServce.class);
Customer customer=new Customer();
customer.setUsername("����");
customer.setJobs("maker");
customer.setPhone("10086");
customerServce.addCustomer(customer);
	}

}
