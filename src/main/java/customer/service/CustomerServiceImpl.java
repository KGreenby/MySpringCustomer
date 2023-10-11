package customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import customer.dao.CustomerDao;
import customer.vo.CustomerVO;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerDao customerDao;

	@Override
	public List<CustomerVO> getCustomerList() {
		return customerDao.readAll();
	}

	@Override
	public CustomerVO getCustomer(String name) {
		return customerDao.read(name);
	}
	
	
}
