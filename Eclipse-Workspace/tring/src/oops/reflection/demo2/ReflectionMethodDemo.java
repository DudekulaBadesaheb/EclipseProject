package oops.reflection.demo2;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionMethodDemo {

	public static void main(String[] args) throws Exception {

		Dog myDog = new Dog();
 
		Method[] dogMethods = myDog.getClass().getDeclaredMethods();
		Method method = dogMethods[0];
		method.setAccessible(true);
		method.invoke(myDog, 5);

		Field[] dogFields = myDog.getClass().getDeclaredFields();
		Field field = dogFields[0];
		System.out.println(field.getName());
		field.setAccessible(true);
		field.set(myDog, "Lucky");
		System.out.println(myDog.someThing());
	}

}