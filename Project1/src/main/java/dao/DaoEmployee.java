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

public class DaoEmployee {
	/*
	 * -An Employee can submit a reimbursement request (DONE) 
	 * -An Employee can view their pending reimbursement requests (DONE)
	 * -An Employee can view their resolved reimbursement requests(DONE) 
	 * -An Employee can view their information (DONE)
	 * -An Employee can update their information (DONE)
	 * 
	 */
	private static final String INSERT_REIMBURSEMENT = "INSERT INTO reimbursements"
			+ "  (amount, requester, status, resolvedby) VALUES " + " (?, ?, 'Pending', null);";

	
	private static final String SELECT_USER_BY_ID = "SELECT empid ,name ,salary ,username ,password ,jobtitle ,address FROM employees WHERE empid =?;";

	private static final String SELECT_PENDING_REIMBURSEMENT = "SELECT amount, requester, status, resolvedby FROM reimbursements WHERE (status = 'Pending' AND requester =?);";
	
	private static final String UPDATE_USERS_SQL = "UPDATE employees SET name = ?, address =? WHERE empid = ?;";
	
	private static final String SELECT_RESOLVED_REIMBURSEMENT = "SELECT amount, requester, status, resolvedby FROM reimbursements WHERE (status = 'Approved' AND requester =?) OR ( status = 'Denied' AND requester = ?);'";
	
	
	/*
	 * Insert a new reimbursement into a Reimbursement object
	 */
	
	public void insertReimbursement(Reimbursement reim) throws SQLException {
		System.out.println(INSERT_REIMBURSEMENT);
		
		
		try (Connection connection = DBConnection.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_REIMBURSEMENT)) 
		{
			preparedStatement.setLong(1, reim.getAmount());
			preparedStatement.setString(2, reim.getRequester());
			preparedStatement.setString(3, reim.getStatus());
			preparedStatement.setString(4, reim.getResolvedby());
			System.out.println(preparedStatement);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {

		}
	}

	
	public static List<Employee> selectOneEmployee() {

		System.out.println(SELECT_USER_BY_ID);
		// using try-with-resources to avoid closing resources (boiler plate code)
		List<Employee> currentEmp = new ArrayList<>();
		// Step 1: Establishing a Connection
		try (Connection connection = DBConnection.getConnection();

				// Step 2:Create a statement using connection object
				PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER_BY_ID);) {
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
				currentEmp.add(new Employee(empid, name, salary, username, password, jobtitle, address));
			}
		} catch (SQLException e) {

		}
		return currentEmp;
	}
	
	
	
	/*
	 * Select an employee in the database by their employeeID (empid)
	 */
	public static Employee selectEmployee(int empid) {
		System.out.println(SELECT_USER_BY_ID);
        Employee empl = null;
       
        try (Connection connection = DBConnection.getConnection();
            
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER_BY_ID);) 
        {
            preparedStatement.setInt(1, empid);
            System.out.println(preparedStatement);
            
            ResultSet rs = preparedStatement.executeQuery();

           
            while (rs.next()) {
                String name = rs.getString("name");
                int salary = rs.getInt("salary");
                String username = rs.getString("username");
                String password = rs.getString("password");
                String jobtitle = rs.getString("jobtitle");
                String address = rs.getString("address");
                
                empl = new Employee(empid, name, salary, username, password, jobtitle,address);
            }
        } catch (SQLException e) {
            
        }
        return empl;
    }

	/*
	 * Employee update. They can only update their name and address, not their salary, username
	 * password, or jobtitle
	 */
	
	public boolean updateUser(Employee emplo) throws SQLException {
		System.out.println(UPDATE_USERS_SQL);
        boolean rowUpdated;
        try (Connection connection = DBConnection.getConnection(); PreparedStatement statement = connection.prepareStatement(UPDATE_USERS_SQL);) {
            statement.setString(1, emplo.getName());
            statement.setString(2, emplo.getAddress());
            

            rowUpdated = statement.executeUpdate() > 0;
        }
        return rowUpdated;
    }

	
	/*
	 * Using the status to differentiate between a pending reim
	 * or a resolved reim (a resolved reim will either be 'Approved'
	 * or it will be 'Denied'
	 */
	public Reimbursement selectReimPending(String status) {
		System.out.println(SELECT_PENDING_REIMBURSEMENT);
        Reimbursement reim = null;
       
        try (Connection connection = DBConnection.getConnection();
            
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_PENDING_REIMBURSEMENT);) 
        {
            preparedStatement.setString(1, status);
            
            System.out.println(preparedStatement);
            
            ResultSet rs = preparedStatement.executeQuery();

           
            while (rs.next()) {
                int amount = rs.getInt("amount");
                String requester = rs.getString("requester");
                String resolvedby = rs.getString("resolvedby");
               
                
                reim = new Reimbursement( status, amount, requester, resolvedby);
            }
        } catch (SQLException e) {
            
        }
        return reim;
    }


	/*
	 * Differentiate the reimbursements by seeing if it is 'Approved' or 'Denied'
	 * and returning those reimbursements
	 */
	public Reimbursement selectReimResolve(String status, String requester) {
		System.out.println(SELECT_RESOLVED_REIMBURSEMENT);
        Reimbursement reimR = null;
       
        try (Connection connection = DBConnection.getConnection();
            
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_RESOLVED_REIMBURSEMENT);) 
        {
            preparedStatement.setString(1, status);
            preparedStatement.setString(2, requester);
            
            System.out.println(preparedStatement);
            
            ResultSet result = preparedStatement.executeQuery();

           
            while (result.next()) {
                int amount = result.getInt("amount");
                //String requester = result.getString("requester");
                String resolvedby = result.getString("resolvedby");
               
                
                reimR = new Reimbursement( status, requester, amount,  resolvedby);
            }
        } catch (SQLException e) {
            
        }
        return reimR;
    }


}
