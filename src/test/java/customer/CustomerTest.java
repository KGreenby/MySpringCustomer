package customer;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import customer.dao.mapper.CustomerMapper;
import customer.service.CustomerService;
import customer.vo.CustomerVO;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "classpath:spring-bean-customer.xml")
public class CustomerTest {
	@Autowired
	DataSource dataSource;
	
	@Autowired
	SqlSessionFactory sessionFactory;
	
	@Autowired
	SqlSession sqlSession;
	
	@Autowired
	CustomerMapper customerMapper;
	
	@Autowired
	CustomerService customerService;
	
	
	@Test
	public void dataSource() {
		try {
			Connection connection = dataSource.getConnection();
			DatabaseMetaData metaData = connection.getMetaData();
			System.out.println("DB Product Name : " + metaData.getDatabaseProductName());
			System.out.println("DB Driver : " + metaData.getDriverName());
			System.out.println("DB Url : " + metaData.getURL());
			System.out.println("DB Username : " + metaData.getUserName());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void sessionFactory() {
		System.out.println(sessionFactory.getClass().getName());
	}
	
	@Test @Disabled
	public void session() {
		CustomerVO customerVO = sqlSession.selectOne("selectCustomerByName", "김그린비");
		System.out.println(customerVO);
	}
	
	@Test @Disabled
	public void mapper() {
		CustomerVO customerVO = customerMapper.selectCustomerByName("김그린비");
		System.out.println(customerVO);
	}
	
	@Test
	public void service() {
		CustomerVO customerVO = customerService.getCustomer("김그린비");
		System.out.println(customerVO);
	}
	
	
}
