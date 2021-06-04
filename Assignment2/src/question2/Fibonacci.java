package question2;

public class Fibonacci {
	//Generate the Fibonacci sequence using a for loop
	
	
	public static void main(String[] args) {
		
		int f1= 0;
		int f2= 1;
		
		for(int in=0; in<13; in++) 
		{
			
			System.out.println(f1); // print the first interation
			int fibo= f1 + f2;     // create fibo to add the first two indexes together
			f1 = f2;				// set the first index back to where the second left off
			f2 = fibo;				// set the second index to the sum so it can progress
			
		}

	}

}
