package question5;

import java.util.Scanner;

public class AlphabetIfElse {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		char input= str.charAt(0);
		
		
		if(input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u') {
			System.out.println("Your input is a vowel");
		
		}
		else  
		{
			System.out.println("Your input is a consonate");
		}

	}

}
