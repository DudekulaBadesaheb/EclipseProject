package oops.inheritance.bemo2;

public class Mine {

	public static void main(String[] args) {
		Dog jim = new Dog();
		jim.color = "block";
		jim.legs = 4;
		jim.makesSound();
		System.out.println(jim.color);
		System.out.println(jim.legs);

		Kangaroo kang = new Kangaroo();
		kang.color = "brown";
		kang.legs = 2;
		kang.makesSound();
		System.out.println(kang.color);
		System.out.println(kang.legs);

	}

}
