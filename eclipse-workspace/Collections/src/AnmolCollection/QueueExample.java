package AnmolCollection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	/* 
	 *  we insert the items at the end of the queue and items are removed from
	 *  	the beginning of the queue
	 *  
	 *  	FIFO structure -> First In First Out !!!
	 *  
	 *  	we insert items here + get items here <-->  | STACK |
	 *  	we insert items here -> | QUEUE | -> we get the items here
	 *  
	 *  java.util.LinkedList 
	 *  java.util.PriorityQueue -> PriorityQueue stores its elements internally according 
	 *  	to their natural order (if they implement Comparable)
	 *  
	 *  add() -> we add items to the queue
	 *  
	 *  element() -> approximately the same as peek(): we get the first item without
	 *  	removing it
	 *  
	 *   remove() -> this method removes the element at the head of the queue
	 *   
	 *   Applications: breadth-first search !!!
	 */
	
	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList<>();
		
		queue.add("Adam");
		queue.add("Joe");
		queue.add("Kevin");
		
		System.out.println(queue.remove());
		System.out.println(queue.element());
		System.out.println(queue.size());
//		System.out.println(queue.remove());
//		System.out.println(queue.remove());
	}
}
