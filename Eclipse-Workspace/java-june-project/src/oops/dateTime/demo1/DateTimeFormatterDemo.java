package oops.dateTime.demo1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// DateTimeFormatter class

public class DateTimeFormatterDemo {

	public static void main(String[] args) {
		LocalDateTime timestamp = LocalDateTime.now();
		System.out.println(timestamp);

		DateTimeFormatter formatter;

		// DateTimeFormatter.ofPattern()
		formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

		// format()
		// formats this date-time using the specified formatter.
		// returns the formatted date-time string
		String ts = timestamp.format(formatter);
		System.out.println(ts);

		// E return day of the week // e.g. Wed
		formatter = DateTimeFormatter.ofPattern("E dd-MM-yyyy");
		ts = timestamp.format(formatter);
		System.out.println(ts);

		// MMM return month name // e.g. Jul
		formatter = DateTimeFormatter.ofPattern("E dd-MMM-yyyy");
		ts = timestamp.format(formatter);
		System.out.println(ts);

		// B returns time of the day // e.g. in the morning
		formatter = DateTimeFormatter.ofPattern("B dd-MM-yyyy");
		ts = timestamp.format(formatter);
		System.out.println(ts);
	}

}
