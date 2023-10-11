package customer.service;

import java.util.List;

import customer.vo.CustomerVO;

public interface CustomerService {
	public List<CustomerVO> getCustomerList();
	public CustomerVO getCustomer(String name);
}
