package question5;

import java.util.Scanner;

public class PowerForLoop {
//  Calculate the power of a number using a for loop.
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter base : ");
        int base = scanner.nextInt();
        System.out.print("Enter exponent : ");
        int exponent = scanner.nextInt();

        long power = 1;

        // Multiply base, exponent times
        for(int i = 1; i <= exponent; i++) {
            power = power * base;
        }

        System.out.println("\nResult " + base + " ^ " + exponent + " = " + power);
       
		
	}

}
