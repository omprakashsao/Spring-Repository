package in.pwskills.om.bean;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("oracledb")
public class EmployeeMySQLImpl implements IEmployee {
	
	@Autowired
	private DataSource ds;
	
	@Override
	public void getConnetion() {
		// TODO Auto-generated method stub
		System.out.println(ds);
		
		Connection connection;
		try {
			connection = ds.getConnection();
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("select * from student where sid = 1");
			
			
				if(rs.next()) {
					System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(4)+"\t"+rs.getInt(3));
				}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
