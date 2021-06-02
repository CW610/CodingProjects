package question10;

import java.util.Scanner;

/*
 * Recursion in java is a process in which a method calls itself continuously. 
 * A method in java that calls itself is called recursive method.
 */
public class PowerRecursion {

	public static void main(String[] args) {
		Power();
		
	}

	
	static void Power() {
		Scanner sca = new Scanner(System.in);
		System.out.println("Enter your basenumber please");
		int basenumber = sca.nextInt(); 
		System.out.println("Enter your basenumber please");
		int exponent = sca.nextInt();
		double pow = Math.pow(basenumber, exponent);

		  System.out.println("Result: " + pow);
	}
}
