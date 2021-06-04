package question7;
import java.util.ArrayList;
import java.util.Collections;
public class Test  {
	public static void main(String[] args) {
		ArrayList<Student> arr = new ArrayList<Student>();  
		arr.add(new Student(1,"Lucy", 33));
		arr.add(new Student(4,"Marilyn", 23));
		arr.add(new Student(3,"Iris", 35));
		arr.add(new Student(2,"Tanya", 44));
		Collections.sort(arr);
		for(int i=0; i < arr.size(); i++) {
			System.out.println("Name: " + arr.get(i).name + "\tRank: " + arr.get(i).rank + "\tAge: " + arr.get(i).age );
		}
	}

}
