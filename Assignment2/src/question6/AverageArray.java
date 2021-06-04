package question6;

public class AverageArray {
//Program to Calculate Average Using Arrays
	public static void main(String[] args) {
		int blu [] = {1,2,3,4,5,6};
		double avg = 0;
		double sum = 0;
		
		for(int s=0; s < blu.length+1; s++) {
			 sum = sum + s;
			
		}
		    avg = sum / blu.length;
			
			System.out.println(avg);
	}

}
