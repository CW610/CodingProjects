package question11;

public class CharacterCount {
	public static void main(String[] args){
		String str = "Sally sells seashells at sunset by the seashore for super high prices";
		System.out.println(str);
		// count occurrence, iterate through the string, add to count if a lowercase or uppercase s is found
		int count = 0;
	    for (int i=0; i < str.length(); i++)
	    {
	        if (str.charAt(i) == 's' || str.charAt(i) == 'S') 
	        {
	             count++;
	        }
	    }
		System.out.println("occurrence of s: "+count);
	}

}
