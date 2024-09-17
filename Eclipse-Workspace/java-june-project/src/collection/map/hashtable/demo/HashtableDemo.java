package collection.map.hashtable.demo;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Set;

public class HashtableDemo {

	public static void main(String[] args) {
		Hashtable<String, Integer> monthMap = new Hashtable<>();
		System.out.println(monthMap);

		// put(Object, Object) // put(key, value)
		// putting values to the hashtable
		monthMap.put("January", 31);
		monthMap.put("February", 28);
		monthMap.put("March", 31);
		monthMap.put("April", 30);
		monthMap.put("May", 31);

		// not allowed as it throws NullPointerException
		// monthMap.put(null, null);

		System.out.println(monthMap);

		Integer value;
		// get(key)
		// getting values from the hashtable
		value = monthMap.get("January");
		System.out.println(value);

		// remove(key)
		// removes the key (and its corresponding value) from this hashtable
		value = monthMap.remove("May");
		System.out.println(value);

		// keySet()
		// get all the keys of the elements in this hashtable
		// returns a Set of the keys contained in this hashtable
		Set<String> monthNameSet = monthMap.keySet();
		System.out.println(monthNameSet);

		// values()
		// get all the values of the elements in this hashtable
		Collection<Integer> noOfDaysList = monthMap.values();
		System.out.println(noOfDaysList);

		// Access both the keys and values of the elements using for each loop
		// output format => Month: January No of Days: 31
		for (String month : monthMap.keySet()) {
			int days = monthMap.get(month);
			System.out.println("Month: " + month + " No of Days: " + days + "");
		}

	}

}
