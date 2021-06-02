package question2;

import java.util.Scanner;

public class RemainQuo {

	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter your first number");
		int input = scan.nextInt();
		System.out.println("Enter your second number");
		int input2 = scan.nextInt();
		int quo = input / input2;
		int remain = input % input2;
		System.out.println("Your quotient is " + quo);
		System.out.println("Your remainder is " + remain);
	}

}
