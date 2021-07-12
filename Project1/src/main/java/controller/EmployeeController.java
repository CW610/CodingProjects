package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.DaoEmployee;
import database.DBConnection;
import models.Employee;

/**
 * Servlet implementation class EmployeeController
 */

public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private DaoEmployee daoE;

	public EmployeeController() {
		super();
		
	}

	@Override
	public void init() {
		Connection connection = DBConnection.getConnection();
		if (connection != null) {
			System.out.println("Connection to database success");
		}
		daoE = new DaoEmployee();
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getServletPath();

		try {
			switch (action) {
			case "/new":
				 showNewForm(request, response);
				break;
			case "/edit":
				showEditForm(request, response);
				break;
			case "/update":
				 updateEmployee(request, response);
				break;
			case "/list":
				SelectEmployee(request, response);
				break;
			default:
				RequestDispatcher dispatcher = request.getRequestDispatcher("/list");
				dispatcher.forward(request, response);
				break;
			}
		} catch (SQLException ex) {
			throw new ServletException(ex);
		}

	}
	
	
	// An employee can look at their info and theirs alone
	private void SelectEmployee(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		System.out.println("inside select employee");
		List<Employee> Emp = daoE.selectAllEmployees();
		
		request.setAttribute("Emp", Emp);
		RequestDispatcher dispatcher = request.getRequestDispatcher("EmployeeList.jsp");
		dispatcher.forward(request, response);
		System.out.println(Emp);
	}

	// An employee can register themselves
	private void showNewForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("EmployeeForm.jsp");
		dispatcher.forward(request, response);
	}

	// employee can update themselves
	private void showEditForm(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		int empid = Integer.parseInt(request.getParameter("empid"));
		Employee existingEmp = DaoEmployee.selectEmployee(empid);
		RequestDispatcher dispatcher = request.getRequestDispatcher("EmployeeForm.jsp");
		request.setAttribute("employee", existingEmp);
		dispatcher.forward(request, response);

	}
	
	// employee can update themselves
	 private void updateEmployee(HttpServletRequest request, HttpServletResponse response)
	            throws SQLException, IOException {
	        int empid = Integer.parseInt(request.getParameter("empid"));
	        String name = request.getParameter("name");
	        String username = request.getParameter("username");
	        String address = request.getParameter("address");
	        Employee upEmp = new Employee(empid, name, username, address);
	       daoE.updateEmpl(upEmp);
	        response.sendRedirect("list");
	    }

}
