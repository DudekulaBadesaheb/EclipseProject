package oops.reflection.demo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionMethodDemo {

	public static void main(String[] args) throws Exception, Exception, Exception {
		Cat myCat = new Cat("michael",1);
		Method[] catMethods = myCat.getClass().getDeclaredMethods();
		for(Method method : catMethods) {
System.out.println(method.getName());			
		}
		for(Method method : catMethods) {
			if (method.getName().equals("meow")){
				method.invoke(myCat, 5);
				myCat.meow(3);
			}
		}
		for(Method method : catMethods) {
			if (method.getName().equals("heyThisIsPriveteMethod")){
				method.setAccessible(true);
				
				// throws IllegalAccessException
				method.invoke(myCat);
				// myCat.heyThisIsPrivateMethod();// private method
			}
		}
		for(Method method : catMethods) {
			if (method.getName().equals("heyThisIspublicMethod")){
				method.setAccessible(true);
				
				// throws IllegalAccessException
				method.invoke(null);
				Cat.thisIsPublicStaticMethod();
				// myCat.heyThisIsPublicMethod();// private method
			}
		}
		for(Method method : catMethods) {
			if (method.getName().equals("heyThisIsPriveteMethod")){
				method.setAccessible(true);
				
				// throws IllegalAccessException
				method.invoke(null);
				Cat.thisIsPublicStaticMethod();
				// myCat.heyThisIsPrivateMethod();// private method
			}
		}
	}
		
		
}
