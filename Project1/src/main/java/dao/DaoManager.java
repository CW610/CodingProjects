package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import database.DBConnection;
import models.Employee;
import models.Reimbursement;

public class DaoManager {

	/*
	 * -A Manager can approve/deny pending reimbursement requests (DONE) 
	 * -A Manager can view all pending requests from all employees (DONE)
	 * -A Manager can view all resolved requests from all employees and see which manager resolved it (DONE)
	 * -A Manager can view all Employees (DONE) 
	 * -A Manager can view reimbursement requests from a single Employee (DONE)
	 * 
	 */

	private static final String CHANGE_PENDING = "UPDATE reimbursements SET  status = ? WHERE status = 'Pending';";
	private static final String SELECT_ALL_EMP = "select * from employees;";
	private static final String SELECT_PENDING = "SELECT reimbursements WHERE status = 'Pending';";
	private static final String SELECT_REIM_MANAGE= "SELECT amount, requester, status, resolvedby FROM reimbursements WHERE (status = 'Approved') OR ( status = 'Denied');";
	private static final String SELECT_REIM_EMP = "SELECT amount, requester, status, resolvedby FROM reimbursements WHERE requester=?;";
	
	/*
	 * Manager sets the status if a status is pending, then on the front end it will
	 * change
	 */

	public Reimbursement ChangeReimPending(String status) {
		System.out.println(CHANGE_PENDING);
		Reimbursement reim = null;

		try (Connection connection = DBConnection.getConnection();

				PreparedStatement preparedStatement = connection.prepareStatement(CHANGE_PENDING);) {
			preparedStatement.setString(1, status);

			System.out.println(preparedStatement);

			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				int amount = rs.getInt("amount");
				String requester = rs.getString("requester");
				String resolvedby = rs.getString("resolvedby");

				reim = new Reimbursement(status, amount, requester, resolvedby);
			}
		} catch (SQLException e) {

		}
		return reim;
	}
	
	

	/*
	 * Select all of the employees and put them in a List
	 */

	public List<Employee> selectAllEmployees() {

		System.out.println(SELECT_ALL_EMP);
		// using try-with-resources to avoid closing resources (boiler plate code)
		List<Employee> employees = new ArrayList<>();
		// Step 1: Establishing a Connection
		try (Connection connection = DBConnection.getConnection();

				// Step 2:Create a statement using connection object
				PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_EMP);) {
			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();

			// Step 4: Process the ResultSet object.
			while (rs.next()) {
				int empid = rs.getInt("empid");
				String name = rs.getString("name");
				long salary = rs.getLong("salary");
				String username = rs.getString("username");
				String password = rs.getString("password");
				String jobtitle = rs.getString("jobtitle");
				String address = rs.getString("address");
				employees.add(new Employee(empid, name, salary, username, password, jobtitle, address));
			}
		} catch (SQLException e) {

		}
		return employees;
	}
	
	
	/*
	 * Very similar to ChangeReimPending. Use the status to select only where status = 'Pending'
	 */
	public Reimbursement ViewReimPending(String status) {
		System.out.println(SELECT_PENDING);
		Reimbursement reim = null;

		try (Connection connection = DBConnection.getConnection();

				PreparedStatement preparedStatement = connection.prepareStatement(SELECT_PENDING);) {
			preparedStatement.setString(1, status);

			System.out.println(preparedStatement);

			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				int amount = rs.getInt("amount");
				String requester = rs.getString("requester");
				String resolvedby = rs.getString("resolvedby");

				reim = new Reimbursement(status, amount, requester, resolvedby);
			}
		} catch (SQLException e) {

		}
		return reim;
	}
	
	/*
	 * Get all of the resolved reimbursements and see who resolved them.
	 */
	
	public Reimbursement selectReimResolveManage(String status) {
		System.out.println(SELECT_REIM_MANAGE);
        Reimbursement reimR = null;
       
        try (Connection connection = DBConnection.getConnection();
            
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_REIM_MANAGE);) 
        {
            preparedStatement.setString(1, status);
           
            
            System.out.println(preparedStatement);
            
            ResultSet result = preparedStatement.executeQuery();

           
            while (result.next()) {
                int amount = result.getInt("amount");
                String requester = result.getString("requester");
                String resolvedby = result.getString("resolvedby");
               
                
                reimR = new Reimbursement( status, requester, amount,  resolvedby);
            }
        } catch (SQLException e) {
            
        }
        return reimR;
    }
	
	
}
