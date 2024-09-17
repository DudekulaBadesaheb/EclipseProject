package collection.map.hashtable.demo;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Set;

public class HashtableDemo {

	public static void main(String[] args) {
		Hashtable<String,Integer> monthMap = new Hashtable();
		System.out.println(monthMap);
		
		// put(object, object) // put (key , value)
		
		// putting value to the Hashtable
		monthMap.put("january", 31);
		monthMap.put("February", 28);
		monthMap.put("march", 31);
		monthMap.put("April", 30);
		monthMap.put("may", 31);
		monthMap.put("june", 30);
		
		
		// not allowed as it throws NullPointerException
		//monthMap.put(null, null);
		System.out.println(monthMap);
		
		Integer value;
		// get(key)
		// getting values from the HashTable
		value = monthMap.get("january");
		System.out.println(value);
		
		
		// remove(key)
		// remove the key (and its corresponding value) from this HashTable
		value = monthMap.remove("may");
		System.out.println(value);
		
		// keySet()
		// get all the keys of the elements in this HashTable
		Set<String> monthNameSet = monthMap.keySet();
		System.out.println(monthNameSet);
		 
		//values()
		// get all the values of the element in thisHashTable
		Collection<Integer> noOfDayList= monthMap.values();
		System.out.println(noOfDayList);
		
		// Access both the keys and values of the elements using for each loop
		// output format => Month :january no of Days: 31
		
		
			
			
			
			
	for(String key:monthMap.keySet()) {
		 Integer element =monthMap.get(key);
		System.out.println("month"+key+" : Days="+element);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		// 
		

		}
	}

}
