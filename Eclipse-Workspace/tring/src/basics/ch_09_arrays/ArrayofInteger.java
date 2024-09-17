package basics.ch_09_arrays;

public class ArrayofInteger {

	public static void main(String[] args) {
		int[] numberArray= {1,2,3,4,5};
		//			index   0 1 2 3 4
		System.out.println(numberArray[0]);
		numberArray[4]=10;
		System.out.println(numberArray[4]);
		
		
		int rollnumberArray[]= {100,101,102,103};
		
		int mobilenumberArray[];
		mobilenumberArray =new int[5];
		
		int registernumberArray[]= new int[] {1001,1002};
		
		System.out.println(registernumberArray[1]);
		int element =numberArray[3];
		System.out.println(element);
		
	}

}
