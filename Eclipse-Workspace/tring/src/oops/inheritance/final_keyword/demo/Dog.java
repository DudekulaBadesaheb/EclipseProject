package oops.inheritance.final_keyword.demo;

public class Dog extends Animal{
	
	private int walkiDistancePreference;
	
	public void bark() {
		System.out.println("woof woof woof");
		
	}

	public int getWalkiDistancePreference() {
		return walkiDistancePreference;
	}

	public void setWalkiDistancePreference(int walkiDistancePreference) {
		this.walkiDistancePreference = walkiDistancePreference;
	}
	@Override
	public  void eat() {
		System.out.println(" nom nom nom"+FinalDemo.PI);
	}
	

}
