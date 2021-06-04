package question17;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Type a word below to see if it is a Palindrome");
		StringBuffer str = new StringBuffer( scan.nextLine());
		
		
		StringBuffer rev = str.reverse();
		
		System.out.println(str);
		System.out.println(rev);
		if(str.equals(rev)) {
			System.out.println("Palindrome");
		}else {
			System.out.println(" Not Palindrome");
		}
	}

}
