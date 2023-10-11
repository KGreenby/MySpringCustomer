package customer.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import customer.vo.CustomerVO;

public class CustomerDaoImplJDBC implements CustomerDao {
	private JdbcTemplate jdbcTemplate;
	
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<CustomerVO> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerVO read(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
