package question8;

import java.util.ArrayList;
import java.util.Collections;

import question7.Student;

public class TestComparator {
	public static void main(String[] args) {
	ArrayList<Student> arr = new ArrayList<Student>();  
	arr.add(new Student(1,"Elizabeth", 21));
	arr.add(new Student(4,"Dahlia", 43));
	arr.add(new Student(3,"Rose", 52));
	arr.add(new Student(2,"Harriet", 34));
	arr.add(new Student(5,"Ophelia", 33));
	arr.add(new Student(6,"Louise", 23));
	Collections.sort(arr, new Rank());
	System.out.println("Sorting all players by Rank: ");
	for(int i=0; i < arr.size(); i++) {
		System.out.println("Name: " + arr.get(i).name + "\tRank: " + arr.get(i).rank + "\tAge: " + arr.get(i).age );
	}
	System.out.println();
	Collections.sort(arr, new Age());
	System.out.println("Sorting all players by Age: ");
	for(int i=0; i < arr.size(); i++) {
		
		System.out.println("Name: " + arr.get(i).name + "\tRank: " + arr.get(i).rank + "\tAge: " + arr.get(i).age );
	}

}
}
