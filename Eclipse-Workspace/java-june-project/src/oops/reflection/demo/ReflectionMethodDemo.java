package oops.reflection.demo;

import java.lang.reflect.Method;

public class ReflectionMethodDemo {

	public static void main(String[] args) throws Exception {
		Cat myCat = new Cat("Michael", 1);

		Method[] catMethods = myCat.getClass().getDeclaredMethods();

		for (Method method : catMethods) {
			System.out.println(method.getName());
		}

		// for instance methods with parameters
		for (Method method : catMethods) {
			if (method.getName().equals("meow")) {
				method.invoke(myCat, 5);
				myCat.meow(3);
			}
		}

		// for private instance methods with no parameters
		for (Method method : catMethods) {
			if (method.getName().equals("heyThisIsPrivateMethod")) {
				method.setAccessible(true);

				// throws IllegalAccessException
				method.invoke(myCat);
				// myCat.heyThisIsPrivateMethod(); // private method
			}
		}

		// for public static methods
		for (Method method : catMethods) {
			if (method.getName().equals("thisIsPublicStaticMethod")) {
				method.setAccessible(true);

				// throws IllegalAccessException
				method.invoke(null);
				Cat.thisIsPublicStaticMethod();
			}
		}

		// for private static methods
		for (Method method : catMethods) {
			if (method.getName().equals("thisIsPrivateStaticMethod")) {
				method.setAccessible(true);

				// throws IllegalAccessException
				method.invoke(null);
			}
		}

	}
}
