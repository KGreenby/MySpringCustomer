package customer.dao.mapper;

import java.util.List;

import customer.vo.CustomerVO;

public interface CustomerMapper {
	List<CustomerVO> selectCustomerList();
	CustomerVO selectCustomerByName(String name);
}
