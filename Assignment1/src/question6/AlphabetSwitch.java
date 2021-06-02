package question6;

import java.util.Scanner;

public class AlphabetSwitch {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		String stri = scann.next();
		
		char in= stri.charAt(0);
		switch(in)
		{
			case 'a':
			case 'e':
			case 'i':  
			case 'o':
			case 'u':
				System.out.println("it is a vowel");
			break;
	
			default:
				System.out.println("it is a consonent");
		}

	}

}
