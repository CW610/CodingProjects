package models;

import java.sql.ResultSet;

/*
 * Employee parent class that the child Manager extends
 * basic private information (for encapsulation) with
 * public getters and setters and a toString method
 */



public class Employee {

	private int empid;
	private String name;
	private long salary;
	private String username;
	private String password;
	private String jobTitle;
	private String address;


	public Employee(int empid, String name, long salary, String username, String password, String jobTitle, String address) {
		
		this.empid=empid;
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

	public Employee(int empid, String name, String username, String address) {
		// TODO Auto-generated constructor stub
	}

	public Employee(String string) {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empid, String name, String address) {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, String address, int empid) {
		// TODO Auto-generated constructor stub
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

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
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

	
	@Override
	public String toString() {
		
		return "Employee: " +
				" id: " + empid +
				", name: " + name +
				", salary: " +salary +
				", username: " + username +
				", password: " + password +
				", job title: " + jobTitle;
	}
	// needs a emp id, name, salary, address, username, password
}
