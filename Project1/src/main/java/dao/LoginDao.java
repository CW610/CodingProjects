package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



import database.DBConnection;
import models.Employee;




public class LoginDao {
	
	public boolean validate(Employee emp) throws ClassNotFoundException{
		
		boolean status = false;
		
		Connection connection=DBConnection.getConnection();
		String SQL = "SELECT * FROM employees WHERE username=? AND password=? AND jobtitle=? ";
		try {
			PreparedStatement ps=connection.prepareStatement(SQL);
			ps.setString(1, emp.getUsername());
			ps.setString(2, emp.getPassword());
			ps.setString(3, emp.getJobTitle());
			ResultSet rs = ps.executeQuery();
			status=rs.next();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return status;
	}
	
	
	
	
	

}
