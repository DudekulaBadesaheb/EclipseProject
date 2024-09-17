package oops.inheritance.final_keyword.demo1;

// public final class Animal
public class Animal {

	private String name;
	private String color;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// public final void eat(){
	public void eat() {
		System.out.println("munch munch munch");
	}

}
