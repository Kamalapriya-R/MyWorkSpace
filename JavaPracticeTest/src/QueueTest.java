import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 1. MAintains First-In-First-Out order
		 * 2. Ordered List which holds elements which are about to be processed.
		 * 3. There are various classes like PriorityQueue, Dequeue and ArrayDeque.
		 */
		//Hold Elements which are to be processed by their priorities.Does not contain null value.
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("Kp");
		pq.add("Abi");
		pq.add("Bhuvana");
		pq.add("Dharini");
		pq.add("Chandra");
		System.out.println("elements in PriorityQueue: "+pq);
		System.out.println("Head: "+pq.element());
		System.out.println("Head: "+pq.peek());
		pq.remove();
		System.out.println("Queue after remove(): "+pq);
		pq.poll();
		System.out.println("Queue after poll(): "+pq);
		//Using Iterator:
		Iterator<String> itr = pq.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
