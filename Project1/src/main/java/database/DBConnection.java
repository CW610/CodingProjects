package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	public static Connection getConnection() {
		
		Connection con = null;
		String loadDriver = "oracle.jdbc.driver.OracleDriver";
		String dbURL = "jdbc:oracle:thin:@project1database.cbci4h6nizj7.us-east-2.rds.amazonaws.com:1521:ORCL";
		String dbUSER = "admin";
		String dbPASS= "12345678";
		try {
			Class.forName(loadDriver);
			con = DriverManager.getConnection(dbURL, dbUSER, dbPASS);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

}
