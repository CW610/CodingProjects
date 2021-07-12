package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import database.DBConnection;
import models.Employee;
import models.Reimbursement;

public class DaoEmployee {
	/*
	 * BACKEND
	 * -An Employee can submit a reimbursement request (DONE) 
	 * -An Employee can view their pending reimbursement requests (DONE)
	 * -An Employee can view their resolved reimbursement requests(DONE) 
	 * -An Employee can view their information (DONE)
	 * -An Employee can update their information (DONE)
	 * 
	 * The System.out.println() is soley there for markers as the program 
	 * executes
	 */
	private static final String INSERT_REIMBURSEMENT = "INSERT INTO reimbursements"
			+ "  (amount, requester, status, resolvedby) VALUES " + " (?, ?, 'Pending', null);";

	
	private static final String SELECT_ALL = "SELECT * from employees";
	private static final String SELECT_USER_BY_ID = "SELECT empid ,name ,salary ,username ,password ,jobtitle ,address FROM employees WHERE empid =?";

	private static final String SELECT_PENDING_REIMBURSEMENT = "SELECT amount, requester, status, resolvedby FROM reimbursements WHERE status = 'Pending' AND requester =?";
	
	private static final String UPDATE_USERS_SQL = "UPDATE employees SET name = ?, address =? WHERE empid = ?";
	
	private static final String SELECT_RESOLVED_REIMBURSEMENT = "SELECT amount, requester, status, resolvedby FROM reimbursements WHERE (status = 'Approved' AND requester =?) OR ( status = 'Denied' AND requester = ?)'";

	private static final String USER_LOGIN = "SELECT * FROM employees WHERE username =? AND password=?";


	private String jdbcURL;


	private String jdbcUsername;


	private String jdbcPassword;
	
	

     
	
	public DaoEmployee() {
		// TODO Auto-generated constructor stub
	}


	public Employee loginAttempt(String username, String password) {
		
		Employee emp = new Employee();

	    try (Connection con = DBConnection.getConnection();
	        PreparedStatement stmt = con.prepareStatement(USER_LOGIN);) {
	    	
	      stmt.setString(1, username);
  		  stmt.setString(2, password);
  		  ResultSet rs = stmt.executeQuery();
	        while(rs.next()) {
	        emp.setEmpid(rs.getInt("empid"));
	        emp.setName(rs.getString("name"));
	        emp.setSalary(rs.getInt("salary"));
	        emp.setUsername(rs.getString("username"));
	        emp.setPassword(rs.getString("password"));
	        emp.setJobTitle(rs.getString("jobtitle"));
	        emp.setAddress(rs.getString("address"));
	       
	        }
	    } catch (SQLException e) {
	      e.printStackTrace();
	    }
		return emp;
	}
	
	 
	
	
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

	
	public List<Employee> selectAllEmployees() throws SQLException {
		
		System.out.println(SELECT_ALL);
		
		List<Employee> currentEmp = new ArrayList<>();
		
		Connection connection = DBConnection.getConnection();
		Statement statement = connection.createStatement();
				
			ResultSet rs = statement.executeQuery(SELECT_ALL);
			System.out.println("after result set execution");
			
		
			while (rs.next()) {
				int empid = rs.getInt("empid");
				String name = rs.getString("name");
				long salary = rs.getLong("salary");
				String username = rs.getString("username");
				String password = rs.getString("password");
				String jobtitle = rs.getString("jobtitle");
				String address = rs.getString("address");
				Employee emplo = new Employee(empid,name,salary, username, password, jobtitle, address);
				currentEmp.add(emplo);
				
				
				
				System.out.println("End of selectOneEmployee");
				System.out.println(currentEmp);
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
	
	public boolean updateEmpl(Employee emplo) throws SQLException {
		System.out.println(UPDATE_USERS_SQL);
        boolean rowUpdated;
        try (Connection connection = DBConnection.getConnection(); PreparedStatement statement = connection.prepareStatement(UPDATE_USERS_SQL);) {
        	statement.setString(1, emplo.getName());
            statement.setString(2, emplo.getAddress());
            statement.setInt(3, emplo.getEmpid());

            rowUpdated = statement.executeUpdate()>0;
        }
        return rowUpdated;
    }

	
	/*
	 * Using the status to differentiate between a pending reim
	 * or a resolved reim (a resolved reim will either be 'Approved'
	 * or it will be 'Denied'
	 */
	public Reimbursement selectReimPending(String status, String requester) {
		System.out.println(SELECT_PENDING_REIMBURSEMENT);
        Reimbursement reim = null;
       
        try (Connection connection = DBConnection.getConnection();
            
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_PENDING_REIMBURSEMENT);) 
        {
            preparedStatement.setString(1, status);
            preparedStatement.setString(2, requester);
            
            System.out.println(preparedStatement);
            
            ResultSet rs = preparedStatement.executeQuery();

           
            while (rs.next()) {
                int amount = rs.getInt("amount");
                
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
