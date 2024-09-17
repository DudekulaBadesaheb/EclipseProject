package stream.filter.a2;

import java.util.Arrays;
import java.util.List;

// Create a list of following cities
// bangalore,mumbai.delhi,jaipur,hydrabad,pune
// filter the city ending with "i"
// and show them in console

public class FilterWithStringExampule {
	public static void main(String[] args) {
		List<String> subjectList = Arrays.asList("bangalore", "mumbai", "delhi", "jaipur", "hydrabad", "pune");
		subjectList.stream().filter(s->s.endsWith("e")).forEach(System.out::println);
//subjectList.stream().filter(s->s.startsWith("m")).forEach(System.out::println);
		
	}
}
