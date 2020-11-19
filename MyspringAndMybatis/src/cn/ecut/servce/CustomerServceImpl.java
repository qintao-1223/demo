package cn.ecut.servce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ecut.mapper.CustomerMapper;
import cn.ecut.po.Customer;
@Service
@Transactional
public class CustomerServceImpl implements CustomerServce{
	@Autowired
	private CustomerMapper customerMapper;
	@Override
	public void addCustomer(Customer customer) {
		this.customerMapper.addCustomer(customer);
		int i=1/0;
		
	}

}
