import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 1. Stack is subclass of Vector
		 * 2. Follows Last-In-First-Out data structure
		 * 3. Contains all of the methods of Vector and also includes push() , peek() , push(Object o)
		 */
		// Push() and Pop()
		Stack<String> st = new Stack<>();
		st.push("KP");
		st.push("Padma");
		st.push("Ramesh");
		st.push("Viku");
		st.push("Sridhar");
		System.out.println("Stack after push(): "+st);
		//Pop() removes last inserted element in the stack
		st.pop();
		System.out.println("Stack after pop(): "+st);
		//Peek() fetches last inserted element of the stack
		System.out.println("Stack after peek(): "+st.peek());
	}

}
