package oops.exception;

public class ErrorHandlingDemo2 {

	public static void main(String[] args) {
		
		try {
			
			String name = null;

			if (name.equals("abc")) {
				System.out.println("name is equal to abc");
			} else {
				System.out.println("name is not equal to abc");
			} // end else
			
		} // end try
		
		catch(Exception e) {
			e.printStackTrace();			
			
		} // end catch

		System.out.println("THIS_WILL_BE_EXECUTED_AFTER_THROWING_EXCEPTION");

	} // end main()
} // end class{}
