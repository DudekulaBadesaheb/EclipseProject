package stream.map.examples.a1;

import java.util.Arrays;
import java.util.List;

public class MapExample1 {

	public static void main(String[] args) {

		List<String> subjectList;

//		subjectList = new ArrayList<>();
//		subjectList.add("java");
//		subjectList.add("python");
//		subjectList.add("sql");
//		subjectList.add("ai");
//		subjectList.add("manual testing");

		subjectList = Arrays.asList("java", "python", "sql", "ai", "manual testing");
		System.out.println(subjectList);

		subjectList.stream().map(s -> s.toUpperCase()).forEach(System.out::println);

	}

}
