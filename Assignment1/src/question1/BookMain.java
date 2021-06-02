package question1;

import java.util.Scanner;

public class BookMain {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		Book book1= new Book(scan.nextInt(),scan.next(),scan.next(),scan.nextDouble(),scan.nextInt() );
		System.out.println(book1.getIsbn()+ "-" + book1.getName()+ "-" +book1.getAuthor()+ "-" + book1.getPrice() + "-" + book1.getCopies());
	}

}
