package question10;

import java.util.Scanner;

public class Lambda {
	static Scanner scan= new Scanner(System.in);
	interface Squarer{  
	    public int square(int x);  
	}  
	// need interface for this problem when using lambda
	public static void main(String[] args) {
		System.out.println("Enter the number to be squared");
		int y = scan.nextInt();
		Squarer sqr = (x) -> (x*x);
		System.out.println(sqr.square(y));
		
		

	}

}
