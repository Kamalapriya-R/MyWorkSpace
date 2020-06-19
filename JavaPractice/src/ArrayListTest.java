import java.util.ArrayList;
import java.util.Collections;

// The Class name should not be same as package name as it conflicts with the package import.
@SuppressWarnings("unused")
public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ArrayList:
		 * 1. Dynamic Array storing duplicate elements of all data types
		 * 2. Maintains insertion order and non-synchronized
		 * 3. Elements can be randomly accessed
		 */
		// ArrayList declaration(Declare Package from java.util class
		ArrayList<Integer> arrlist1 =  
                new ArrayList<Integer>(5);
		arrlist1.add(5);
		arrlist1.add(20);
		arrlist1.add(10);
		arrlist1.add(80);
		
		ArrayList<Integer> arrlist2 = new ArrayList<Integer>(8);
		arrlist2.add(10);
		arrlist2.add(15);
		arrlist2.add(17);
		arrlist2.add(60);
		
		//Using AddAll(Collection<extends E> c) class
		arrlist2.addAll(arrlist1);
		
		//Copying an arraylist to another
		ArrayList<Object> arrlist3 = new ArrayList<>();
		
		//Copy arrlist2 to arrlist3
		/* 1. arrlist3 = arrlist2;
		 * 2. ArrayList<Object> arrlist3 = new ArrayList<>();
		 *  arrlist3 = new ArrayList<Object>(arrlist2);
		 * 3. Using Clone:
		 * arrlist3 = (ArrayList<Object>)arrlist2.clone();
		 */
		arrlist3 = (ArrayList<Object>)arrlist2.clone();
		System.out.println(arrlist3);
		
		
		System.out.println("numbers in arrlist2: "+arrlist2);	
		
		// Remove element from collections using index
		arrlist3.remove(1);
		System.out.println("post removal of object: "+arrlist3);
		
		// Remove element from collections using Object
		arrlist3.remove(0);
		System.out.println("Element removed from list :"+arrlist3);
		
		//RemoveAll Element from Collections
		arrlist3.removeAll(arrlist3);
		System.out.println("post removeAll of objects: "+arrlist3);

		
// RetainAll- retains elements present within the brackets
		ArrayList<String> arrlist5 = new ArrayList<String>();
		ArrayList<String> arrlist6 = new ArrayList<String>();
		
		arrlist5.add("Rock");
		arrlist5.add("Sand");
		arrlist5.add("Paper");
		arrlist5.add("Pipe");
		arrlist6.add("Time");
		arrlist6.add("Dog");
		arrlist6.add("Pen");
		arrlist6.addAll(arrlist5);
		
		System.out.println("Elements in array list 5: "+arrlist5);
		System.out.println("Elements in array list 6: "+arrlist6);
	/*	arrlist6.retainAll(arrlist5);
		System.out.println("After RetainAll: ");
		System.out.println(arrlist5);
		System.out.println(arrlist6); */
		
		System.out.println("Size of ArrayList6: "+arrlist6.size());
		arrlist5.clear();
		System.out.println("ArrayList after Clear(): ");
		System.out.println("ArrayList Containing element starting with letter 'P': "+arrlist6.contains("Pipe"));
		System.out.println("Checks if collections arrlist5 is empty: "+arrlist5.isEmpty());
		}

}
