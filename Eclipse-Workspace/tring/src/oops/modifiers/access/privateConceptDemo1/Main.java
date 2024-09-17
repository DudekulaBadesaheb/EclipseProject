package oops.modifiers.access.privateConceptDemo1;

public class Main {

	public static void main(String[] args) {
		Software software = new Software();
		
		//cannot access / not visible as these are private
		//software.model ="desktop";
		// software.version = 10.01;
		SoftwareSUB softwareSUB =new SoftwareSUB();
		//cannot access / not visible as these are private
	    //software.model ="desktop";
		// software.version = 10.01;

	}

}
