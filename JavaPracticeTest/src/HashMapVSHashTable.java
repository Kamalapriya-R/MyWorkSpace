// A sample Java program to demonstrate HashMap and HashTable 
import java.util.*; 
import java.lang.*; 
import java.io.*; 

/* Name of the class has to be "Main" only if the class is public. */
public class HashMapVSHashTable 
{ 
	public static void main(String args[]) 
	{ 
		//----------hashtable ------------------------- Prints in insertion order(Last-in-First-out) order 
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>(); 
		ht.put(100,"Ajay"); 
		ht.put(100,"Barath"); 
		ht.put(102,"Chandra"); 
		ht.put(103,"Dhanya"); 
		System.out.println("-------------Hash table--------------"); 
		for (Map.Entry m:ht.entrySet()) { 
			System.out.println(m.getKey()+" "+m.getValue()); 
		} 

		//----------------hashmap-------------------------------- 
		HashMap<Integer,String> hm=new HashMap<Integer,String>(); 
		hm.put(100,"Amit"); 
		hm.put(104,"Amit"); // hash map allows duplicate values 
		hm.put(101,"Vijay"); 
		hm.put(102,"Rahul"); 
		System.out.println("-----------Hash map-----------"); 
		for (Map.Entry m:hm.entrySet()) { 
			System.out.println(m.getKey()+" "+m.getValue()); 
		} 
	} 
} 
