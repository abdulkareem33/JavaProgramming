package day20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
		//Declaration
		
		HashSet myset=new HashSet();
		
		//Set myset=new HashSet();
		
		//HashSet <String>myset=new HashSet<String>();
		
		//Adding elements in Hashset
		
		myset.add(100);
		myset.add(10.5);
		myset.add("welcome");
		myset.add(true);
		myset.add('A');
		myset.add(100);
		myset.add(null);
		myset.add(null);
		
		System.out.println(myset); //[null, A, 100, 10.5, welcome, true]

		//Removing element
		myset.remove(10.5);  //10.5 is value (not index)
		System.out.println("After removing"+myset);
		
		//Inserting Element - Not possible
		
		//Access specific element - Not possible
		
		//convert hashSet to array list
		
		ArrayList al=new ArrayList(myset);
		System.out.println(al);
		System.out.println(al.get(2));
		
		//Read all elements using for each loop
		
		for(Object x:myset)
		{
			System.out.println(x);
		}
		
		//using iterator
		
		Iterator <Object> it=myset.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//clearing all the elements in Hashset
		
		myset.clear();
		System.out.println(myset.isEmpty()); //true
		
		
	}

}
