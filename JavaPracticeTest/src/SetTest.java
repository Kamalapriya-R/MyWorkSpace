import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 1. Represents unordered set of elements
		 * 2. Does not allow us to store duplicate elements
		 * 3. At most one null value in set is allowed.
		 * 4. Set is implemented by HashSet, LinkedHashSet and TreeSet
		 */
		
		/* HashSet: Represents Collections that uses HashTable for storage.
		 * Hashing is used to store elements in HashSet.
		 * Contains unique elements.
		 */
		HashSet<String> hs = new HashSet();
		hs.add("Kp");
		hs.add("Viku");
		hs.add("Viku Vikuku Viku");
		hs.add("Kp");
		hs.add("Supraba");
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println("Elements in HashSet: "+itr.next());
		}
		
		//LinkedHashSet
		/* 1. Represents LinkedList implementation of Set Interface
		 * 2. It extends the HashSet and implements the Set interface
		 * 3. Contains Unique elements, maintains insertion order and permits null element.
		 */
		LinkedHashSet<String> lhs = new LinkedHashSet();
		lhs.add("Kp");
		lhs.add("Viku");
		lhs.add("Viku Vikuku Viku");
		lhs.add("Kp");
		lhs.add(" ");
		lhs.add("Supraba");
		Iterator<String> itr1 = hs.iterator();
		while(itr1.hasNext()) {
			System.out.println("Elements in LinkedHashSet: "+itr1.next());
		}
		
	}

}
