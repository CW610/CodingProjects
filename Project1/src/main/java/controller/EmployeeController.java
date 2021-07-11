package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import dao.DaoEmployee;
import models.Employee;

/**
 * Servlet implementation class EmployeeController
 */
@WebServlet("/EmployeeController")
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	DaoEmployee daoE = new DaoEmployee();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String action = request.getServletPath();

        try {
            switch (action) {
                case "/new":
                    //showNewForm(request, response);
                    break;
                case "/insert":
                   // insertUser(request, response);
                    break;
                case "/delete":
                  //  deleteUser(request, response);
                    break;
                case "/edit":
                  //  showEditForm(request, response);
                    break;
                case "/update":
                 //   updateUser(request, response);
                    break;
                default:
                    SelectEmployee(request, response);
                    break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
		
	
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
		// An employee can look at their info
	private void SelectEmployee(HttpServletRequest request, HttpServletResponse response)
		    throws SQLException, IOException, ServletException {
				List < Employee >Emp = DaoEmployee.selectOneEmployee();
		        request.setAttribute("Emp", Emp);
		        RequestDispatcher dispatcher = request.getRequestDispatcher("EmployeeList.jsp");
		        dispatcher.forward(request, response);
		    }
	private void showEditForm(HttpServletRequest request, HttpServletResponse response)
		    throws SQLException, ServletException, IOException {
		        int id = Integer.parseInt(request.getParameter("id"));
		        Employee existingEmp = DaoEmployee.selectEmployee(id);
		        RequestDispatcher dispatcher = request.getRequestDispatcher("user-form.jsp");
		        request.setAttribute("user", existingEmp);
		        dispatcher.forward(request, response);

		    }
	

			  }
	


