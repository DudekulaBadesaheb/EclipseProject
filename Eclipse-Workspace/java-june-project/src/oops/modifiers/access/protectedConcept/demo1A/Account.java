package oops.modifiers.access.protectedConcept.demo1A;

import oops.modifiers.access.protectedConcept.demo1.Bank;

public class Account extends Bank{

	public void getBranchName() {
		System.out.println(branchName);
	}
	
	public void getBranchCode() {
		System.out.println(branchCode);
	}
	
	public static void main(String[] args) {
		Account account = new Account();
		account.branchName = "BTM Layout";
		account.branchCode = 750;
		account.getBranchName();
		account.getBranchCode();
		System.out.println(account.branchName);
		System.out.println(account.branchCode);
	}
}
