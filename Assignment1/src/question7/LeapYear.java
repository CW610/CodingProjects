package question7;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your year to see if it is a leap year");
		
		int year = sc.nextInt();
		
		if(year % 4 == 0) {
			System.out.println("This year is a leap year :)");
			
		}
		else {
			System.out.println("This year is NOT a leap year :(");
		}

	}

}
