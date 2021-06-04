package question10;

public class WordCount {
	// count the words in a string
	public static void main(String[] args) {
		String str = "The mountains are lovely to look at";
		
		int count= 1;
		
		/*
		 * iterate through the string with a for loop
		 * if it hits a space AND the index ahead does not
		 * increase the count (word count)
		 */
		for(int i=0; i<str.length()-1;i++)
		{
			if(str.charAt(i)== ' ' && str.charAt(i+1) != ' ') {
				count++;
			}
		}
			System.out.println("Your word count is " + count);
	}

}
