package basics.ch_08_strings;

public class StringMethodes {

	public static void main(String[] args) {
		String Subject;
		Subject = new String("java");
		System.out.println(Subject);
		// ToUpperCase()
		// converts a String to upper case letter
		// returns string converted to uppercasr
		String text;
		text = Subject.toUpperCase();
		System.out.println(text);
		System.out.println(Subject);
		// tolower Case()
		// converts a String to lower case letters
		// return a string converted to lowercase
		text = Subject.toLowerCase();
		System.out.println(text);

		boolean isTrueOrFalse;
		// contains("value")
		// check whether a string contains a sequence of characters
		//
		isTrueOrFalse = Subject.contains("av");
		System.out.println(isTrueOrFalse);

		isTrueOrFalse = "JAVA".equals("java");
		System.out.println(isTrueOrFalse);

		isTrueOrFalse = "SQL".equalsIgnoreCase("sql");
		System.out.println(isTrueOrFalse);
		// replaceAll("oldText","newText")
		//

		text = Subject.replaceAll("ja", "ma");
		System.out.println(text);

		int index;
		// indexOf('character')
		// returns the index or position of the first found occurence of
		// the specified characters in a string
		// returns -1 if character is not found
		index = Subject.indexOf('j');
		System.out.println(index);
		index = Subject.indexOf('z');
		System.out.println(index);

		index = Subject.indexOf("av");
		System.out.println(index);

		char character;
		// charAt(index)
		// returns the character value at the specified index (position)
		character = Subject.charAt(2);
		System.out.println(character);

		int size;
		// length()
		// returns the length of a specified string
		// returns the count of total characters in the specified
		 size = "machine learning".length();
		System.out.println(size);

		// isEmpty()
		// checks whether a string is empty or not

		isTrueOrFalse = "".isEmpty();
		System.out.println(isTrueOrFalse);

		isTrueOrFalse = " ".isEmpty();
		System.out.println(isTrueOrFalse);
		// lastIndexOf('character')
		// returns the position of the last found occurence of
		// specified character

		index = Subject.lastIndexOf('a');
		System.out.println(index);
		
		// endwith("text")
		//tests if this string end with the specified suffix
		// chek wherher a string a  ends with the specified character(s)
		//return true or fales
		
		isTrueOrFalse ="world".endsWith("ld");
		System.out.println(isTrueOrFalse);
		
		//startsWith("text")
		// checks whethar a string stsrts with specified character(s)
		//returns true or false
		
		isTrueOrFalse="hello".startsWith("he");
		System.out.println(isTrueOrFalse);
		// trim()
		// remove 
	
		text="          sun shine        ".trim();
		System.out.println(text);
		
		
		//isBlank()
		
		
		
	}

}
