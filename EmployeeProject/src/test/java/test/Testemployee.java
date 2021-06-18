package test;

import static org.junit.Assert.*;

import org.junit.Test;

import employeeproject.Address;
import employeeproject.Employee;
import employeeproject.EmployeeServiceImp;

public class Testemployee extends EmployeeServiceImp  {

	@Test
	public void testYearlySalary() {
		Employee employee = new Employee(5,"Lawrence", 3400, new Address("Cincinatti", "Ohio"));
		double salary1=calculateYearlySalary(employee);
		System.out.println(salary1);
		
		  
	}
	
	

}
