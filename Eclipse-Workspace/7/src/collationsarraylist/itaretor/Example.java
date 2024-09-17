package collationsarraylist.itaretor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Example {
	public static void main(String[] args) {
		List<Integer> numberList = new ArrayList<>();
		numberList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		System.out.println(numberList);
		Integer total=0;

		Iterator<Integer> iterator = numberList.iterator();
		
		while (iterator.hasNext()) {
			Integer da=iterator.next();
			if(da>4) {
				total = total+da;
			}

		}
		System.out.println(total);
	}

}
