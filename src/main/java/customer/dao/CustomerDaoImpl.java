package customer.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import customer.vo.CustomerVO;

public class CustomerDaoImpl implements CustomerDao {

	private SqlSession session;

	@Override
	public List<CustomerVO> readAll() {
		List<CustomerVO> customerList = session.selectList("userNS.selectCustomerList");
		return customerList;
	}

	@Override
	public CustomerVO read(String id) {
		CustomerVO customerVO = session.selectOne("userNS.selectCustomer");
		return customerVO;
	}
}
