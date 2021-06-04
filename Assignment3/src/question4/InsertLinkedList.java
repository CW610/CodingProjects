package question4;
import java.util.LinkedList;
public class InsertLinkedList {
	
	public static void main(String[] args) {
		   // create an empty linked list
		     LinkedList<String> l_list = new LinkedList<String>();
		   // use add() method to add values in the linked list
		          l_list.add("Purple");
		          l_list.add("Blue");
		          l_list.add("Black");
		     System.out.println("Original linked list:" + l_list);    
		  // Add an element at the end of a linked list
		     l_list.offerLast("Yellow");
		     System.out.println("Final linked list:" + l_list);  
		 }

}
