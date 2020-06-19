import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* LinkedList:
		 * 1. Uses Double Linked List internally
		 * 2. Stores the duplicate elements
		 * 3. Maintains the insertion order and non-Synchronized.
		 */
		LinkedList<String> LL = new LinkedList<String>();
		LL.add("Kp");
		LL.add("Kamal");
		LL.add("Supraba");
		LL.add("Viku");
		Iterator<String> itr = LL.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
