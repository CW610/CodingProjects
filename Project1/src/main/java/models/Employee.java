package models;

import java.sql.ResultSet;

public class Employee {

	private int empID;
	private String name;
	private long salary;
	private String username;
	private String password;
	private String jobTitle;
	private String address;


	public Employee(int empID, String name, long salary, String username, String password, String jobTitle, String address) {
		
		this.empID=empID;
		this.name=name;
		this.salary=salary;
		this.username=username;
		this.password=password;
		this.jobTitle=jobTitle;
		this.address=address;
	}
	
	public Employee(String username, String password) {
		
	}
	
	
	public Employee(ResultSet resultSet) {
		
	}
	
	public Employee() {
		
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	
	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	public String toString() {
		
		return "Employee: " +
				" id: " + empID +
				", name: " + name +
				", salary: " +salary +
				", username: " + username +
				", password: " + password +
				", job title: " + jobTitle;
	}
	// needs a emp id, name, salary, address, username, password
}
