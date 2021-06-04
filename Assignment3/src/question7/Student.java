package question7;


public class Student implements Comparable<Student> {
	public int rank;  
	public String name;  
	public int age;  
 public Student(int rank,String name,int age){  
	this.rank=rank;  
	this.name=name;  
	this.age=age;  
}  
  
public int compareTo(Student student){  
	if(rank==student.rank)  
	return 0;  
	else if(rank>student.rank)  
	return 1;  	
	else  
	return -1;  
}  

}
