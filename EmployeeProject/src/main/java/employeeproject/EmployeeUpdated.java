package employeeproject;

public class EmployeeUpdated {
private	int empNo;
private	String empName;
private	double salary;
private	Address address;
	
	public EmployeeUpdated(int empNo, String empName, double salary, Address address) {
		
		this.empNo=empNo;
		this.empName=empName;
		this.salary=salary;
		this.address= address;
		
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String toString() {
		return empNo + " " + empName+ " " + salary+ " " + address;
		
	}

}
