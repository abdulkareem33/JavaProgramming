package day20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListSecond {

	public static void main(String[] args) 
	{	
		//Declartaion
		
		ArrayList mylist=new ArrayList();
		
		//List mylist=new ArrayList();
		
		//ArrayList <Integer>mylist=new ArrayList<Integer>();
		
		//Adding data into array list
		
		mylist.add(100);		//add() method
		mylist.add(10.5);		
		mylist.add("welcome");
		mylist.add('A');
		mylist.add(true);
		mylist.add(100);
		mylist.add(100);
		mylist.add(null);
		
		//size of array list 
		
		System.out.println("Size of an arraylist:"+mylist.size()); 		 //size() method
		
		//printing arraylist
		
		System.out.println("Printing data from arraylist"+mylist);
		
		//Remove element from arraylist
		
		mylist.remove(5);
		System.out.println("After removing 5th element data from arraylist"+mylist); //remove() method
		
		//insert element in the arraylist
		
		mylist.add(2, "java");
		
		System.out.println("After insertion element data from arraylist"+mylist); // add(2,"java") method
		
		//Modify element in the arraylist (Modify/replace/change)
		
		mylist.set(2,"python");
		
		System.out.println("After change element data from arraylist"+mylist);   //set()method
		
		//Access Specific element from arrylist
		System.out.println(mylist.get(3));					//get()method
		
		//Reading all the elements from arraylist
		
		//using normal for loop
		
		for(int i=0;i<mylist.size();i++)
		{
			System.out.println(mylist.get(i));
		}
		
		//using for each loop
		
		for(Object x:mylist)
		{
			System.out.println(x);
		}
		
		//using iterator
		
		Iterator<Object> it=mylist.iterator();
		
		while(it.hasNext())						//hasNext() method
		{
			System.out.println(it.next());			//next() method
		}
		
		//Checking arraylist is empty or not
		
		System.out.println("Is arraylist empty?  "+mylist.isEmpty());  //isEmpty() method
		
		//remove all the elements from arraylist		
		
		ArrayList mylist2=new ArrayList();
		mylist2.add("100");
		mylist2.add("welcome");
		
		
		mylist.removeAll(mylist2);				//removeAll() method 
		System.out.println("After removing mulitiple elements"+mylist);
		
		//remove all the elements //clear() method
		mylist.clear();
		System.out.println("Is arraylist empty?  "+mylist.isEmpty());
		
		
		
	}

}
