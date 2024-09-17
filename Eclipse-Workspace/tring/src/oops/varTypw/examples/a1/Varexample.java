package oops.varTypw.examples.a1;

public class Varexample {

	public static void main(String[] args) {
          // byte
		var byteNumber = 127;
		System.out.println(byteNumber);
		// short
		var shortNumber = 32767;
		System.out.println(shortNumber);
		//int
		var number =999999;
		System.out.println(number);
		// long
		var longNumber = 1_234_567_890_123l;
		System.out.println(longNumber);
		
		// float
		var floatNumber=10f;
		System.out.println(floatNumber);
		
		// double
		var doubleNumber=1.2345678911;
		System.out.println(doubleNumber);
		
		// boolean
		var flag=true;
		System.out.println(flag);
		
		// character
		var character='z';
		System.out.println(character);
		
		// String
		var text="you are my sun shine";
		System.out.println(text);
		
		// cat
		var myCat =new Cat("Zoro",1);
		System.out.println(myCat.name+" "+myCat.age);
		System.out.println(new Cat("luna",2).name);
		
		System.out.println();
		

	}

}
