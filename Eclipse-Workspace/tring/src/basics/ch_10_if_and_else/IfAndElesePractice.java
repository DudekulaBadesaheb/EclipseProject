package basics.ch_10_if_and_else;
//import java.util.Scanner;

public class IfAndElesePractice {

	public static void main(String[] args) {
		int age=300;
		if(age>=0 && age<12)
			System.out.println("CHILD");
		else if(age>=12 && age<18)
			System.out.println("teen");
		else if(age>=18 && age<50)
			System.out.println("adult");
		else if(age>=50 && age<127)
			System.out.println("senior");
		else
			System.out.println("hello");
			
	}

}
