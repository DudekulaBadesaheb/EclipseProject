package oops.modifiers.access.privateConcept.demo1;

public class Main {

	public static void main(String[] args) {
		Software software = new Software();
		
		// cannot access / not visible as these are private
		// software.model = "desktop";
		// software.version = 10.01;
		
		SoftwareSub softwareSub = new SoftwareSub();
		
		// cannot access / not visible as these are private 
		// softwareSub.model = "macintosh";
		// softwareSub.version = 13.2;

	}

}
