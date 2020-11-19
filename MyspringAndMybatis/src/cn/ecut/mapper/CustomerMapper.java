package cn.ecut.mapper;

import cn.ecut.po.Customer;

public interface CustomerMapper {
	public Customer findCustomerById(Integer id);
	public void addCustomer(Customer customer);

}
