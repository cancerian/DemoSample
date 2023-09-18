package CollectionQueueDemo;

import java.util.*;

public class QueueDemo {

	public static void main(String[] args) {
		//PriorityQueue q=new PriorityQueue();
		LinkedList q=new LinkedList();
		
		q.add("A");
		q.add("B");
		q.add("C");
		q.offer("C");
		//System.out.println(q);//insertion order preserved and duplicate allowed
		
		//get head elements element() + peek();
		//System.out.println(q.element());
		//System.out.println(q.peek());
		//remove() + poll()
		//System.out.println(q.remove());
		System.out.println(q.poll());
		System.out.println(q);
		/*
		 * Iterator itr=q.iterator(); while(itr.hasNext()) {
		 * System.out.println(itr.next()); }
		 */
		
	}

}
