package oops.superKeyword.exmple.a2;

public class Animal {
public int age;
public String name;
 public Animal() {}
 
 public Animal(int age ,String Name) {
 this.age=age;
 this.name=Name;
 }
 public void makNoise() {
	 System.out.println("hello ! I am an animal.");
 }
 public void eat() {
	 System.out.println("munch munch.");
 }
 
 private void doSomethingPrivate() {
	 System.out.println("hay this method is private.");
 }
}
