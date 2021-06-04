package question1;

public class MultiplicationTable {
	// Generate Multiplication Table using for loop
	public static void main(String[] args) {
		
		
		/*
		 * Using nested for loop to generate columns and rows
		 * by which, j and i are multiplied together and \t
		 * is used to format for readability
		 */
		for(int i = 1; i <= 13; i++) 
		{
		    for(int j = 1; j <= 13; j++) 
		    {
		       System.out.print(i * j + "\t");
		    }
		    System.out.println();
		}

	}

}
