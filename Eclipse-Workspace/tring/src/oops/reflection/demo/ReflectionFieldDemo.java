package oops.reflection.demo;

import java.lang.reflect.Field;

public class ReflectionFieldDemo {

	public static void main(String[] args) throws Exception {
		Cat myCat = new Cat("Stella", 2);

		// myCat.name="Boss; //private access not allowed
		// System.out.println(myCat.name);//private access not allowed
		// System.out.println(myCat.age);// private access not allowed

		// get Class()
		// this method call is our window into a ton of reflection capabillitity in java
		Field[] catFields = myCat.getClass().getDeclaredFields();

		for (Field field : catFields) {
			System.out.println(field.getName());
		}
		for (Field field : catFields) {
			if (field.getName().equals("name")) {

				// to make the private final accessible
				field.setAccessible(true);
// throws IllegalAccessException
				field.set(myCat, "list");
			}
		}
		System.out.println(myCat.getName());
	}

}
