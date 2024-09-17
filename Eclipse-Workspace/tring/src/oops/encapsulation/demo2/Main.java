package oops.encapsulation.demo2;

public class Main {

	public static void main(String[] args) {
		Customer remo;
		remo =new Customer();
		remo.setId(101);
		System.out.println(remo.getId());
		remo.setName("Narendra Modi");
		System.out.println(remo.getName());
		
		Customer katappa;
		katappa=new Customer();
		katappa.setId(231);
		System.out.println(katappa.getId());
		katappa.setName("katappa bahubali");
		System.out.println(katappa.getName());
		

	}

}
