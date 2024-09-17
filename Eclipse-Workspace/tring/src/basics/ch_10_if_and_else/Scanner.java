package basics.ch_10_if_and_else;
//import java.util.Scanner;

public class Scanner {
	public static void main(String[] args) {
		int age=9;
	//Scanner sc=new Scanner(System.in);
	
		if(age>=0 && age<12)
			System.out.println("CHILD");
		if(age>=12 && age<18)
			System.out.println("teen");
		if(age>=18 && age<50)
			System.out.println("adult");
		if(age>=50 && age<127)
			System.out.println("senior");
		else
			System.out.println("hello");
	}
}
