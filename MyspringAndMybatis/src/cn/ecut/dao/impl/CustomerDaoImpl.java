package cn.ecut.dao.impl;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import cn.ecut.dao.CustomerDao;
import cn.ecut.po.Customer;

public class CustomerDaoImpl extends SqlSessionDaoSupport implements CustomerDao {

	@Override
	public Customer findCustomerById(Integer id) {
		// TODO 自动生成的方法存根
		return this.getSqlSession().selectOne("cn.ecut.po"+".CustomerMapper.findCustomerById",id);
		
	}

}
