package basics.ch_08_strings;

public class StringMethods {

	public static void main(String[] args) {
		String subject;

		subject = new String("java");
		System.out.println(subject); // java

		String text;
		// toUpperCase()
		// converts a string to upper case letters
		// returns string converted to uppercase
		text = subject.toUpperCase();

		System.out.println(text); // JAVA
		System.out.println(subject);

		// toLowerCase()
		// converts a string to lower case letters
		// returns a string converted to lowercase
		text = subject.toLowerCase();
		System.out.println(text); // java

		boolean isTrueOrFalse;
		// contains("value")
		// check whether a string contains a sequence of characters
		// returns true or false
		isTrueOrFalse = subject.contains("j");
		System.out.println(isTrueOrFalse); // true

		// equals()
		// compare two strings
		// returns true if the strings are equal, and false if not
		isTrueOrFalse = "java".equals("java");
		System.out.println(isTrueOrFalse); // true

		isTrueOrFalse = "Java".equals("java");
		System.out.println(isTrueOrFalse); // false

		// equalsIgnoreCase()
		// compares two strings, ignoring case considerations
		// returns true if the strings are equal, and false if not
		isTrueOrFalse = "SQL".equalsIgnoreCase("sql");
		System.out.println(isTrueOrFalse); // true

		// replaceAll("oldText", "newText")
		// replaces each substring of this string that matches the given regular
		// expression with the given replacement
		// returns the resulting string
		text = subject.replaceAll("ja", "ma");
		System.out.println(text); // mava

		int index;
		// indexOf('character')
		// returns the index or position of the first found occurence of
		// the specified characters in a string
		// returns -1 if the character is not found
		index = subject.indexOf('j');
		System.out.println(index); // 0
		index = subject.indexOf('z');
		System.out.println(index); // -1

		index = subject.indexOf("av");
		System.out.println(index); // 1

		char character;
		// charAt(index)
		// returns the character value at the specified index (position)
		character = subject.charAt(2);
		System.out.println(character); // v

		int size;
		// length()
		// returns the length of a specified string
		// returns the count of total characters in the specified string
		size = "machine learning".length();
		System.out.println(size); // 16

		// isEmpty()
		// checks whether a string is empty or not
		// returns true if length is 0 otherwise false
		isTrueOrFalse = "".isEmpty();
		System.out.println(isTrueOrFalse); // true

		isTrueOrFalse = " ".isEmpty();
		System.out.println(isTrueOrFalse); // false

		// lastIndexOf('character')
		// returns the position of the last found occurence of
		// specified characters in a string
		// returns -1 if the character is not found
		index = subject.lastIndexOf('a');
		System.out.println(index);

		// endsWith("text")
		// tests if this string ends with the specified suffix
		// checks whether a string ends with the specified character(s)
		// returns true or false
		isTrueOrFalse = "world".endsWith("ld");
		System.out.println(isTrueOrFalse); // true

		// startsWith("text")
		// checks whether a string starts with specified characters(s)
		// returns true or false
		isTrueOrFalse = "hello".startsWith("he");
		System.out.println(isTrueOrFalse); // true

		// trim()
		// removes whitespace from both ends of a string
		// returns the resulting string
		text = "        sun shine       ".trim();
		System.out.println(text); // sun shine

		// isBlank()
		// returns true if the string is empty
		// or contains only whitespace otherwise false
		isTrueOrFalse = " ".isBlank();
		System.out.println(isTrueOrFalse); // trueS

	}

}
