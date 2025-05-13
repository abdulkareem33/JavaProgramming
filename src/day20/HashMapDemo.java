package day20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		
		//declaration
		
		//Map hm=new HashMap();
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		//Adding pairs
		
		hm.put(101,"john");
		hm.put(102,"scott");
		hm.put(103,"mary");
		hm.put(104,"scott");
		hm.put(102,"David");
		
		System.out.println(hm);
		
		//size
		
		System.out.println(hm.size());
		
		//remove pair
		
		hm.remove(103);  //key of the pair
		
		System.out.println("After removing pair"+hm);
		
		//access value of the key
		System.out.println(hm.get(102));
		
		//access all the keys for hashMap
		
		System.out.println(hm.keySet());
		
		//all the values
		
		System.out.println(hm.values());
		
		//keys and values
		System.out.println(hm.entrySet());
		
		//Reading data from hashmap
		
		//for each loop
		
		/*for(int k:hm.keySet())
		{
			System.out.println(k+"   "+hm.get(k));
		}
		*/
		
		//using iterator
		
		 Iterator<Entry<Integer, String>> it=hm.entrySet().iterator();
		 
		 while(it.hasNext())
		 {
			 Entry<Integer,String> entry=it.next();
			 System.out.println(entry.getKey()+"   "+entry.getValue());
		 }
		
		 hm.clear();
		 System.out.println(hm.isEmpty());
		
	}

}
