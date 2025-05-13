package day20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapSecond {

	public static void main(String[] args) 
	{
		
		//declaration 
		
		//HashMap hm=new HashMap();
		//Map hm=new HashMap();
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		//Adding pairs
		
		hm.put(101,"Kareem");		//put()method
		hm.put(102,"john");
		hm.put(103,"mary");
		hm.put(104,"scott");
		hm.put(102, "komari");
		
		System.out.println(hm);
		
		//size of map				//size() method
		
		System.out.println("size of hashmap  "+hm.size());
		
		
		//remove pair
		
		hm.remove(103);		//remove() method
		
		System.out.println("After removing pair:"+hm);
		
		//access value of the key
		
		System.out.println(hm.get(102));  //get() method
		
		//get all the keys from hashmap
		
		System.out.println(hm.keySet());   //keySet() method
		System.out.println(hm.values());	//values() method
		System.out.println(hm.entrySet());  //entrySet method
		
		//for each loop
		
		for(int k:hm.keySet())
		{
			System.out.println(k +"   "+hm.get(k));
		}
		
		//using iterator
		

		Iterator <Entry <Integer, String>> it=hm.entrySet().iterator();
		
		while(it.hasNext())
		{
			Entry<Integer, String> entry=it.next();
			System.out.println(entry.getKey()+ "    "+entry.getValue()); 	//getKey()  //getValue()
		}
		
		//clear
		
		hm.clear();															//clear()
		System.out.println(hm);
		System.out.println(hm.isEmpty());
					
		
	}

}
