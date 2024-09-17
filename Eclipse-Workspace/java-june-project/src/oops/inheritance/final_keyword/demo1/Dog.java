package oops.inheritance.final_keyword.demo1;

public class Dog extends Animal {

	private int walkDistancePreference;

	public void bark() {
		System.out.println("woof woof woof");
	}

	public int getWalkDistancePreference() {
		return walkDistancePreference;
	}

	public void setWalkDistancePreference(int walkDistancePreference) {
		this.walkDistancePreference = walkDistancePreference;
	}
	
	@Override
	public void eat() {
		System.out.println("nom nom nom " + FinalDemo.PI);
	}

}
