package question8;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		Scanner numsc = new Scanner(System.in);
		
		System.out.println("Please enter a number");

		int num = numsc.nextInt();
		
		if(num > 0) {
			System.out.println("Your number is positive!");
		}
		else {
			System.out.println("Your number is negative!");
		}
	}

}
