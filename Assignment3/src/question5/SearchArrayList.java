package question5;

import java.util.ArrayList;
public class SearchArrayList {
	public static void main(String[] args) {
	      //ArrayList aList = new ArrayList();
		ArrayList<String> aList= new ArrayList<String>();
	      aList.add("Baby");
	      aList.add("Child");
	      aList.add("Teenager");
	      aList.add("Adult");
	      aList.add("Elder");
	      int index1 = aList.indexOf("Adult");
	      
	      if(index1 == -1)
	         System.out.println("The element C is not in the ArrayList");
	      else
	         System.out.println("The element Adult is in the ArrayList at index " + index1);
	     
	   }
	}



