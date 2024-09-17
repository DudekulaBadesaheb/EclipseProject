package basics.ch_08_strings;

public class StringBlock {

	public static void main(String[] args) {
		String text = "firstline \nsecond line \nthird line";
		System.out.println(text);
		
		String block =
				"""
				first line
				second line
				thrid line
				""";

	}

}
