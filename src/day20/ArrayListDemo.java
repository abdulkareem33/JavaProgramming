package day20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//Declaration
		
		ArrayList mylist=new ArrayList();
		
		//List mylist=new ArrayList();
		
		//ArrayList <String>mylist=new ArrayList<String>();
		
		//ArrayList <Employee>mylist=new ArrayList<Employee>();	
		
		//Adding data into ArrayList
		mylist.add(100);    //add is a method
		mylist.add(10.5);
		mylist.add("welcome");
		mylist.add('A');
		mylist.add(true);
		mylist.add(100);
		mylist.add(null);
		mylist.add(null);
		
		//size of arraylist
		
		System.out.println("size of an array list"+mylist.size());  //size is method
		
		//Printing arraylist
		System.out.println("Printing data from the array list" +mylist);
		
		//Remove element from arraylist
		
		mylist.remove(5);
		System.out.println("After removing 5th element" +mylist); //after removing
		
		//Insert element in the arrayelements
		
		mylist.add(2,"Java");
		System.out.println("After Insertion  element" +mylist);  //after insert java
		
		//Modify element
		mylist.set(2, "python");   
		System.out.println("After replacing" +mylist);
		
		//access specific element
		
		System.out.println("After accessing element : " +mylist.get(3)); //3 is index
		
		//reading all the elements from arraylist
		
		//case1 - using normal for loop
		
		/*for(int i=0;i<mylist.size();i++)
		{
			System.out.println(mylist.get(i));
		}
		*/
		
		//case2 - using enhanced for loop
		
		/*for(Object x:mylist)
		{
			System.out.println(x);
		}
		*/
		
		//case 3- using iterator
		
		/*Iterator it=mylist.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}*/
		
		//checking arraylist empty or not
		
		System.out.println(mylist.isEmpty());
		
		//remove all the elements in the array list
		
		ArrayList mylist2=new ArrayList();
		mylist2.add(100);
		mylist2.add("welcome");
		
		mylist.removeAll(mylist2);
		
		System.out.println("After removing multiple elements"+mylist);
		
		mylist.clear();
		
		System.out.println(mylist.isEmpty());
		
		
	}

}
