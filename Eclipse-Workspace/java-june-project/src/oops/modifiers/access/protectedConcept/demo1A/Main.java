package oops.modifiers.access.protectedConcept.demo1A;

import oops.modifiers.access.protectedConcept.demo1.Bank;

public class Main {

	public static void main(String[] args) {
		Bank bob = new Bank();

		// protected - not able to access outside the package
		// bob.branchName = "BTM Layout";
		// bob.branchCode = 750;

		// System.out.println(bob.branchName);
		// System.out.println(bob.branchCode);

		Account account = new Account();

		// protected - sub class not able to access outside the package
		// account.branchName = "BTM Layout";
		// account.branchCode = 750;

		// System.out.println(account.branchName);
		// System.out.println(account.branchCode);

	}

}
