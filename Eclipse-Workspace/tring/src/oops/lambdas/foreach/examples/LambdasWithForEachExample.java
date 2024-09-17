package oops.lambdas.foreach.examples;

public class LambdasWithForEachExample {

	public static void main(String[] args) {
		// normal code using anonymous class
        MathOperation add1 = new MathOperation() {
            @Override
            public int operation(int a, int b) {
                return a + b;
            }
        };

        int result;
        result = add1.operation(2, 2);
        System.out.println("addition 1: " + result);

        // using lambda expression for addition
        MathOperation add2 = (a, b) -> a + b;
        result = add2.operation(4, 4);
        System.out.println("addition 2: " + result);

        // using lambda expression for subtraction
        MathOperation sub1 = (a, b) -> a - b;
        result = sub1.operation(10, 5);
        System.out.println("subtraction: " + result);
    }
}