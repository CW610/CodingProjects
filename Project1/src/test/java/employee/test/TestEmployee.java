package employee.test;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import dao.DaoEmployee;
import database.DBConnection;
import models.Employee;
import models.Reimbursement;

public class TestEmployee {

	private String status;
	private String resolvedby;
	private DaoEmployee emplo;

	/*
	 * The following are tests for DaoEmployee
	 * Created a new Dao object and completed 
	 * multiple tests. The ones meant to contain information
	 * are met with assertNotNull(); The last two are meant
	 * to be null because I have not inserted any reimbursements
	 * thus far
	 */
	
	
	@Before
	public void initEach() {
		emplo = new DaoEmployee();
	}

	@Test
	public void loginTest() {
		emplo.loginAttempt("jenna.smith@comp.com", "bubbles");
		assertNotNull(emplo);
		System.out.println(emplo);
	}

	@Test
	public void insertReimTest() throws SQLException {
		Reimbursement money = new Reimbursement(240, "Jenna Smith", status, resolvedby);
		emplo.insertReimbursement(money);
		assertNotNull(money);
		System.out.println(money);

	}

	@Test
	public void selectAll() throws SQLException {
		
		assertNotNull(emplo.selectAllEmployees());
		System.out.println(emplo.selectAllEmployees());
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void selectOne() throws SQLException {
		
		assertNotNull(emplo.selectEmployee(1));
		System.out.println(emplo.selectEmployee(1));
	}
	
	@Test
	public void updateEmp() throws SQLException {
		Employee info = new Employee("tony.nels@comp.com", "14 this road",888 );
		
		assertNotNull(emplo.updateEmpl(info));
	}
	
	@Test
	public void pendingReim() {
		
		assertNull(emplo.selectReimPending(status, "Jenna Smith"));
	}
	
	@Test
	public void resolvedReim() {
		
		assertNull(emplo.selectReimResolve(status, "Tony Nelson"));
	}
	
	
	
	
}
