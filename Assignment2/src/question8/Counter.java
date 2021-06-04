package question8;



public class Counter {
	// Program to count vowels, consonants, digits, and spaces
	public static void main(String[] args) {
		String dog = "The dog loved to play and bark 98 times";
		int countV = 0;
		int countC = 0;
		int countD = 0;
		int countS = 0;
		
		for(int i=0; i<dog.length(); i++) {
			int stringIndex = dog.charAt(i);
			if(stringIndex== 'a'|| stringIndex == 'e' || stringIndex == 'i' || stringIndex=='o' || stringIndex== 'u') 
			{
				countV++;
			}
			else if( (stringIndex >= 'a' && stringIndex <= 'z') || (stringIndex >= 'A' && stringIndex <= 'Z') )
			{
				countC++;
			}
			else if((stringIndex >= '0' && stringIndex <= '9')) 
			{
				countD++;
			}
			else if(stringIndex==' ') {
				countS++;
			}
			
			
			
		}
		System.out.println(" Vowels: " + countV + " Consonants: " + countC + " Digits: " + countD + " Spaces: " +countS);
	}

}
