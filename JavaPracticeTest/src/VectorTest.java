import java.util.Iterator;
import java.util.Vector;

/*Vector and ArrayList both uses Array internally as data structure. They are dynamically resizable. Difference is in the way they are internally resized. By default, Vector doubles the size of its array when its size is increased. But, ArrayList increases by half of its size when its size is increased.

Therefore as per Java API the only main difference is, Vector’s methods are synchronized and ArrayList’s methods are not synchronized.*/

public class VectorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vec = new Vector<String>();
		vec.add("Monday");
		vec.add("Tuesday");
		vec.add("Wednesday");
		Iterator<String> itr = vec.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
