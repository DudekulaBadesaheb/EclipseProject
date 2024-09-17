package oops.reflection.demo2;

public class Dog {
private final String name="bade";
public String someThing() {
	return this.name;
}
	private void iamPrivateStaticMethod(int number) {
		System.out.println("i am private method"+number);
	}
//	private static void iamPrivateStaticMethod() {
//		System.out.println("i am privaate and static method");
//	}
}
