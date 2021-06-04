package question6;
import java.util.ArrayList;
import java.util.Arrays;

public class MergeArrayList {
	
	public static void main(String[] args) 
    {
        ArrayList<String> l1 = new ArrayList<>(Arrays.asList("red", "orange", "yellow", "green", "blue"));
         
        ArrayList<String> l2 = new ArrayList<>(Arrays.asList("indigo", "violet", "black", "grey", "white"));
         
        l1.addAll(l2);    //Merge both lists
         
        System.out.println(l1);
    }

}
