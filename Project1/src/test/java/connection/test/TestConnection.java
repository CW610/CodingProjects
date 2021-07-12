package connection.test;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.Test;

import database.DBConnection;

public class TestConnection {

	/*
	 * Simple test to test the connection.
	 * The test will succeed if the connection is not null.
	 */
	
	@Test
	public void test() {
		Connection connection = DBConnection.getConnection();
		assertNotNull(connection);
	}

}
