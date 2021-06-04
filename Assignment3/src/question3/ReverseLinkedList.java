package question3;
import java.util.LinkedList;
import java.util.ListIterator;
public class ReverseLinkedList {
	 public static void main(String[] args) {
	        
	        LinkedList<String> linkedList = new LinkedList<String>();
	        
	        
	        // add the values to the linked list
	        linkedList.add("Apple");
	        linkedList.add("Bacon");
	        linkedList.add("Coffee");
	        linkedList.add("Danish");
	        linkedList.add("French Fries");
	        
	        System.out.println("Original" + linkedList);
	        System.out.println();
	        /*
	         * First, get an object of the ListIterator
	         * using the listIterator method.
	         * 
	         * Position the cursor at the end of the
	         * linked list by specifying the start index
	         * as the list size
	         */
	        ListIterator<String> listIterator = linkedList.listIterator( linkedList.size() );
	        
	        /*
	         * To iterate the linked list in reverse
	         * direction, use the hasPrevious and previous
	         * methods of the list iterator
	         */
	        while(listIterator.hasPrevious()){
	            System.out.println(( listIterator.previous() ));
	        }
	    }

}
