package day20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetSecond {

	public static void main(String[] args) 
	{
		
		//declaration
		
		HashSet myset=new HashSet();
		//Set myset=new HashSet();
		//HashSet <String>myset=new HashSet<String>();
		
		//adding elements in to hashset
		
		myset.add(100);			    //add() method
		myset.add(10.5);
		myset.add("welcome");
		myset.add(true);
		myset.add('A');
		myset.add(100);
		myset.add(null);
		myset.add(null);
		
		System.out.println(myset);  //[null, A, 100, 10.5, welcome, true]
		
		//removing element 
		
		myset.remove(10.5);			//remove() method
		System.out.println("After removing 10.5 "+myset);
		
		//Inserting element - not possible
		//Access specific element - not possible
		
		//convert hashset to array list
		ArrayList al=new ArrayList(myset);
		System.out.println(al.get(2));
		
		//read all the elements using for... each loop
		
		for(Object x:myset)
		{
			System.out.println(x);
		}
		
		//using iterator
		
		Iterator <Object>it=myset.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//clearing all the elements
		
		myset.clear();
		System.out.println(myset);
		System.out.println(myset.isEmpty());
		
		
		//size
		System.out.println(myset.size());
		
		
		
		
		
		
		
		
		
	}

}
