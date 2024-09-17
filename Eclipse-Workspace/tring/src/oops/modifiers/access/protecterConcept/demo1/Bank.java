package oops.modifiers.access.protecterConcept.demo1;

public class Bank {
	protected String branchName;
	protected int branchCOde;

	public static void main(String[] args) {
		Bank bob = new Bank();
		bob.branchName = "BTM laout";
		bob.branchCOde = 1234;
		System.out.println(bob.branchName);
		System.out.println(bob.branchCOde);

	}

}
