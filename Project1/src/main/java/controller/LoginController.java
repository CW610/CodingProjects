package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.LoginDao;
import models.Employee;


public class LoginController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	public LoginController() {
		super();
	}
	
	/*
	 * doPost method. Requests username and password, sets to new Employee object empl
	 * When the LoginDao object validates Employee empl to see if it matches in the DB, 
	 * and if that empl is a manager, send to manager jsp.
	 * 
	 * If that empl is not a manager, send to employee jsp
	 * if the username and password do not match at all, send to login fail.
	 */
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    // TODO Auto-generated method stub
		
		
		
	      response.setContentType("text/html");
	      String username=request.getParameter("username");
	      String password=request.getParameter("password");
	      String jobtitle=request.getParameter("jobtitle");
	      
	      Employee empl=new Employee();
	      LoginDao dao=new LoginDao();
	      empl.setUsername(username);
	      empl.setPassword(password);
	      empl.setJobTitle(jobtitle);
	      
	      
	      
	      System.out.println(username);
	      System.out.println(jobtitle);
	      // try to validate the employee. if they have the job title of manager, send to manager jsp
	      //if not, send to employee jsp. if no login data matches, send to login fail
	     // try {
			try {
				if(dao.validate(empl))
				  {
					
					if(jobtitle.equalsIgnoreCase("Manager")) {
						
						HttpSession mySession = request.getSession();
						mySession.setAttribute("username", username);
						mySession.setAttribute("Manager", username);
						request.setAttribute("username", username);
						
						response.sendRedirect("managerhomepage.html");
					}
					else {
						System.out.println("Employee has logged in");
						HttpSession mySession = request.getSession();
						request.setAttribute("username", username);
						mySession.setAttribute("Employee", username);
						
						RequestDispatcher dispatcher= request.getRequestDispatcher("/EmployeeController");
						dispatcher.forward(request, response);
						//response.sendRedirect("/EmployeeController");
					}
					
					//RequestDispatcher rd=request.getRequestDispatcher("Employee.jsp");  
				    //rd.forward(request,response);  
					
				  }
				  else
				  {
				    response.sendRedirect("loginfail.html");
				  }
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			
			} catch (IOException e) {
				
				e.printStackTrace();
			}
	
	  
	}	
	
}
