package basics.ch_09_arrays;

import java.util.*;

/*
 * Arrays are used to store multiple values in a single variable, 
 * instead of declaring separate variables for each value.
 * 
 * Arrays contain only elements of same data type
 * 
 * Arrays once initialized the size is fixed
 * 
 * To declare an array, define the variable type with square brackets
*/
public class ArrayTheroy {

	public static void main(String[] args) {
		String[][] cars = { { "volvo", "bmw", "beng", "tata", "marthi" }, { "bmd", "mastang", } };
		cars[1][1] = "bada";
		System.out.println(cars[1][1]);
		System.out.println(Arrays.toString(cars));
		for(String[] i : cars) {
			for(String j : i) {
				System.out.println(j);
				
			}
			
			for(String[] z: cars) {
				for(String y : z) {
				System.out.println(y);
				}
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}

	}
}
