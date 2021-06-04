package question4;

public class ReverseNumber {
	// Reverse a Number using a while loop in Java 
	//HINT - Find the reminser of no by dividing 10  using % operator.
	public static void main(String[] args) {
		
		int num = 2345678;
		int reverse = 0;
		
		/*
		 * using % in order to save the last number of num
		 * to integer var. Then, begin to build the reverse
		 * integer by *10, which will adapt to decimal place
		 * as the iterations continue. Finally, divide the num
		 * by 10 so it goes to the next decimal place
		 */
		while(num != 0) 
		{
			int var = num % 10;
			reverse = reverse* 10 + var;
			num= num/10;
		}
		System.out.println(reverse);

	}

}
