package question1;
import java.util.ArrayList;
import java.util.Collections;
public class Swap {
	
	 public static void main(String[] args) {
		   ArrayList<String> c1= new ArrayList<String>();
		          c1.add("Dog");
		          c1.add("Cat");
		          c1.add("Rabbit");
		          c1.add("Lizard");
		          c1.add("Bird");
		          
		          //iterate through original string and print it out
		          System.out.println("Before Swap:");
		          for(String a: c1){
		          System.out.println(a);
		        }
		          //Swapping 1st(index 0) element with the 3rd(index 2) element
		         Collections.swap(c1, 0, 2);
		          System.out.println("After Swap:");
		          for(String b: c1){
		          System.out.println(b);

}
	 }
}
