package in.pwskills.om.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.pwskills.om.bean.CustomerBO;

@Component("dao")
public class CustomerDaoImpl implements CustomerDao {

	private static final String INSERT_SQL_QUERY = "insert into customer_data(`cname`,`caddress`,`pamt`,`rate`,`time`,`si`) values(?,?,?,?,?,?)";
	@Autowired
	private DataSource ds;

	@Override
	public String insert(CustomerBO bo) {
		
		 Integer count = 0;
		try {
			Connection connection = ds.getConnection();
			PreparedStatement psmt = connection.prepareStatement(INSERT_SQL_QUERY);
			
			psmt.setString(1, bo.getCustomerName());
			psmt.setString(2, bo.getCustomerAddress());
			psmt.setFloat(3, bo.getPamt());
			psmt.setFloat(4, bo.getRate());
			psmt.setFloat(5, bo.getTime());
			psmt.setFloat(6, bo.getSi());
			
			 count = psmt.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return count == 1? "Record is successfully inserted " : "Record insertion failure....";
	}
	
	

}
