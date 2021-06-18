package employeeproject;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import jdk.jfr.internal.Logger;
import sun.util.logging.PlatformLogger.Level;



public  class EmployeeServiceImp implements EmployeeService {
	Scanner scan = new Scanner(System.in);
	//creating a new List of employees already in our system
	private static  ArrayList<Employee> empList = new ArrayList<Employee>() {
		
			
		
		 static final long serialVersionUID = 1L;
			{
				//empList.
			add(new Employee(1, "Jenna", 1750, new Address("Austin", "Texas")));
			add(new Employee(2, "Larry", 1600, new Address("Chicago", "Illinois")));
			add(new Employee(3, "Amy", 1350, new Address("Nashville", "Tennassee")));
			add(new Employee(4, "Judy", 1200, new Address("Birminham", "Alabama")));
			add(new Employee(5, "Michael", 1700, new Address("Albany", "New York")));
			add(new Employee(6, "Chloe", 1620, new Address("Savannah", "Georgia")));
			add(new Employee(7, "Daniel", 1300, new Address("Richmond", "Virginia")));
			add(new Employee(8, "Tina", 1250, new Address("Charleston", "South Carolina")));
			}
		};
	
	public void displayAllEmployees() {
		
		// using stream saves some typing
		// refactored in a lambda
		empList.stream().forEach((employ) -> {System.out.println(employ); });
		
	}

	// Using a monthly salary times 
	public double calculateYearlySalary(Employee e1) {
		double YearlySalary = e1.getSalary()*12;
		return YearlySalary;
	}

	public Employee findByEmployeeNo(int empNo) 
	{
		
		for(Employee e1 : empList) 
		{
	        if(e1.getEmpNo() == empNo) 
	        {
	            return e1;
	        }
	    }
	    return null;
		
	}

	public void updateEmployee() 
	{
		
			
			System.out.println("Type the Employee Number of who you wish to change");
			
			int choi=scan.nextInt();
			
			Change(choi);
			
		
	}
	
	
public void deleteEmployee() 
	{
		System.out.println("Please enter Employee ID of Employee you wish to delete");
	
			int choice =scan.nextInt();
			empList.remove(choice-1);
	        
	       
		System.out.println(empList);
		
	}

	public void addEmployee() {
		System.out.println("Employee ID");
		int newID= scan.nextInt();
		
		System.out.println("Employee Name: ");
		String name = scan.next();
		
		System.out.println("Employee Monthly Earnings: ");
		double salary = scan.nextDouble();
		
		System.out.println("Employee City ");
		String city = scan.next();
		
		System.out.println("Employee State ");
		String state = scan.next();
		
		empList.add(new Employee(newID, name, salary, new Address(city,state)));
		System.out.println("Employee created");
		System.out.println(empList);
		
	}

	public void Change(int empNo) {
		
		System.out.println("Please enter what you would like to change");
		System.out.println("1. Employee Name");
		System.out.println("2. Employee Salary");
		System.out.println("3. Employee Address");
		int cha=scan.nextInt();
		
		switch(cha) {
		case 1:
			
			System.out.println("Enter your name change");
			String name = scan.next();
			findByEmployeeNo(empNo).setEmpName(name);
			System.out.println("New Employee Name " + findByEmployeeNo(empNo).getEmpName());
			System.out.println(empList);
			break;
		case 2:
			double salary=scan.nextDouble();
			findByEmployeeNo(empNo).setSalary(salary);
			System.out.println("New Employee Salary " + findByEmployeeNo(empNo).getSalary());
			System.out.println(empList);
			break;
		case 3:
			System.out.println("Enter a City for new address");
			String city= scan.next();
			System.out.println("Enter a State for new address");
			String state= scan.next();
			
			findByEmployeeNo(empNo).setAddress(new Address(city,state));
			System.out.println("The employee's Address is now set to: " + findByEmployeeNo(empNo).getAddress().getCity() + ", " + findByEmployeeNo(empNo).getAddress().getState());
			
			System.out.println(empList);
			break;
			default:
				System.out.println("Command not recognized");
		}
	
}
}
