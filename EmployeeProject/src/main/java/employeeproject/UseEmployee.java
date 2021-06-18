package employeeproject;


import java.util.logging.Level;
import java.util.Scanner;
import java.util.logging.Logger;



public class UseEmployee  {
	
	// create a logger we can use
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	public static void main(String[] args) {
			//create a new EmployeeServiceImplementation object
				EmployeeServiceImp empl = new EmployeeServiceImp();
				System.out.println("Employee Management System\n");
				Scanner scan = new Scanner(System.in);
				
				menu();
				int option = scan.nextInt(); 
				
					
					
					// based on the option, implement the associated methods
					switch(option) {
					case(1):
						empl.displayAllEmployees();
						System.out.println();
						break;
						
					case(2):
						empl.addEmployee();
						break;
						
					case(3):
						empl.updateEmployee();
						break;
						
					case(4):
						System.out.println("Enter the employee ID Number you wish to find:");
						int id = scan.nextInt();
						Employee person = empl.findByEmployeeNo(id);
						System.out.println("The employee with ID number: " + id + " is : " + person.toString());
						break;
						
					case(5):
						System.out.println("Enter the employee ID to calculate Yearly Salary:");
						int id2 = scan.nextInt();
						Employee person2 = empl.findByEmployeeNo(id2);
						double salary= empl.calculateYearlySalary(person2);
						System.out.println("The yearly salary for that Employee is: " + salary);
						break;
					
					case(6):
						try {
						empl.deleteEmployee();
							LOGGER.log(Level.WARNING, "You deleted part of your array!");
						}catch(IndexOutOfBoundsException ex) {
							LOGGER.log(Level.WARNING, "The index is out of bounds!");
						}
						break;
						
					case(7):
						scan.close();
						System.out.println("Exiting . . .");
						System.exit(0);
						break;
					
						
					}
			
					
					if(option>7) {
						LOGGER.log(Level.INFO, "The choice you have entered does not exist.");
						System.exit(0);
						
					}
					
					
					

				}

	
	
	public static void menu() {
		
		
		
		System.out.println("Enter a number from the menu selection below\n"
				+ "1. Display all employees\n"
				+ "2. Add a new employee\n"
				+ "3. Update employee\n"
				+ "4. Find an employee using their ID\n"
				+ "5. Calculate an employee's yearly salary\n"
				+ "6. Delete an employee\n"
				+ "7. Quit");
		
		
		
		
	}

	}


