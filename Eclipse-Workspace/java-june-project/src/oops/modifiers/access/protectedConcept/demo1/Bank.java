package oops.modifiers.access.protectedConcept.demo1;

public class Bank {

	protected String branchName;
	protected int branchCode;
	
	public static void main(String[] args) {
		Bank bob = new Bank();
		bob.branchName = "BTM Layout";
		bob.branchCode = 750;
		
		System.out.println(bob.branchName);
		System.out.println(bob.branchCode);
	}
}
