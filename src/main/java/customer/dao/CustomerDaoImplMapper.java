package customer.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import customer.dao.mapper.CustomerMapper;
import customer.vo.CustomerVO;

@Repository("CustomerDao")
public class CustomerDaoImplMapper implements CustomerDao {
	
	@Autowired
	private CustomerMapper customerMapper;

	@Override
	public List<CustomerVO> readAll() {
		List<CustomerVO> customerList = customerMapper.selectCustomerList();
		return customerList;
	}

	@Override
	public CustomerVO read(String name) {
		CustomerVO customer = customerMapper.selectCustomerByName(name);
		return customer;
	}
	
}
