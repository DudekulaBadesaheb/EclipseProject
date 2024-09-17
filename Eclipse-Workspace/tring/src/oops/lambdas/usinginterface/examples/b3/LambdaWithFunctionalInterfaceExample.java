package oops.lambdas.usinginterface.examples.b3;

public class LambdaWithFunctionalInterfaceExample {
	

	public static void main(String[] args) {
		Animal dog;
		dog = new Animal() {

			public void sound(String prefix,String suffix) {
				System.out.println(prefix+"bow bow bow "+suffix);

			}

			
			
		};
		dog.sound("****","****");
		Animal cat;
		cat = (suffix,prefix) -> {
			System.out.println(prefix+"meow meow meow"+suffix);

		};
		cat.sound("^^^","^^^");
		Animal cow;
		cow = (s,p) -> System.out.println(p+"amba amba amba"+s);

		cow.sound("###","###");

	}

}