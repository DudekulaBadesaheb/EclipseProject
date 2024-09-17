package basics.ch_06_typecasting;

/*
 * Type casting   - narrowing casting(Manually)
 * Converting a larger type to smaller type
 * double -->float -->long --> int --> char -->short -->byte
 */
/*
 * Type casting		- widening casting(automatically)
 * Converting a smaller type to larger type
 * Byte--> short--> char--> int--> long--> float--> double-->
 */
public class TypecatingTheory {
	// widening casting
	public static void main(String[] args) {
		int myint = 9;
		double mydouble = myint;
		System.out.println(myint);
		System.out.println(mydouble);

		
	}
}
