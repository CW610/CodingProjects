package question8;
import java.util.Comparator;

import question7.Student;
public class Age implements Comparator {
	public int compare(Object o1,Object o2){  
		Student student1=(Student)o1;  
		Student student2=(Student)o2;  
		  
		if(student1.age==student2.age)  
		return 0;  
		else if(student1.age>student2.age)  
		return 1;  
		else  
		return -1;  
		}  
}
