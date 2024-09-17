package oops.methods.recursion.examples.a1;

public class RecursionExample {

	// add numbers upto x
	// e.g. add numbers upto 5
	// 0 + 1 + 2 + 3 + 4 + 5
	// 5 + 4 + 3 + 2 + 1 + 0
	public static void main(String[] args) {
		int result = sum(5);
		System.out.println(result);

	}
	public static int sum(int x) {
		int result = 0;
		if(x>0) {
			result = x + sum(x-1);
		}else {
			return x;
			
		}
		return result;120
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		...........
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//	public static int sum(int x) { // 5 // 4 // 3 // 2 // 1 // 0
//		int result = 0;
//		if (x > 0) {
//			result = x + sum(x - 1);
//			// 5 + sum(5 - 1) => 5 + sum(4)
//			// 5 + 4 + sum(4 - 1) => 5 + 4 + sum(3)
//			// 5 + 4 + 3 + sum(3 - 1) => 5 + 4 + 3 + sum(2)
//			// 5 + 4 + 3 + 2 + sum(2 - 1) => 5 + 4 + 3 + 2 + sum(1)
//			// 5 + 4 + 3 + 2 + 1 + sum(1 - 1) => 5 + 4 + 3 + 2 + sum(0)
//			// 5 + 4 + 3 + 2 + 1 + 0
//		} else {
//			return x;
//		}
//		return result;
//	}

}
