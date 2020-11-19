package cn.ecut.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.ecut.dao.CustomerDao;
import cn.ecut.mapper.CustomerMapper;
import cn.ecut.po.Customer;

public class findCustomerMapperByTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ApplicationContext act=new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerMapper customerMapper=(CustomerMapper) act.getBean("CustomerMapper");
		Customer customer=customerMapper.findCustomerById(2);
		System.out.println(customer);
	}

}
