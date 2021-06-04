package question2;
import java.util.ArrayList;
public class CloneArrayList {
	
	public static void main(String a[])
    {
  
        // create ArrayList
        ArrayList<String> a1
            = new ArrayList<String>();
  
        // Insert elements in ArrayList
        a1.add("Michael");
        a1.add("Maria");
        a1.add("Melvin");
        a1.add("Mia");
  
        // print ArrayList1
        System.out.println("Original = "
                           + a1);
  
        // clone ArrayList
        ArrayList a2
            = (ArrayList)a1.clone();
  
        // print ArrayList2
        System.out.println("Clone = "
                           + a2);
    }
	
	

}
