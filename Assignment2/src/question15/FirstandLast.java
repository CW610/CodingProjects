package question15;

public class FirstandLast {
	public static void
    firstAndLastCharacter(String str)
    {
  
        // Finding string length
        int n = str.length();
  
        // First character of a string
        char first = str.charAt(0);
  
        // Last character of a string
        char last = str.charAt(n - 1);
  
        // Printing first and last
        // character of a string
        System.out.println("First: " + first);
        System.out.println("Last: " + last);
    }
  
    // Driver Code
    public static void main(String args[])
    {
        // Given string str
        String str = "I love rabbits because they hop";
  
        // Function Call
        firstAndLastCharacter(str);
    }

}
