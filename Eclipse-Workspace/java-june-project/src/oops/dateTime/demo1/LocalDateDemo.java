package oops.dateTime.demo1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class LocalDateDemo {

	public static void main(String[] args) {

		// LocalDate.now()
		// returns current date from the system clock in the default time-zome.
		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate);

		// getDayOfWeek()
		// returns the enum DayOfWeek for the day-of-week
		DayOfWeek dow = currentDate.getDayOfWeek();
		System.out.println(dow);

		// getDayOfMonth()
		// returns the primitive int value for the day-of-month
		int dom = currentDate.getDayOfMonth();
		System.out.println(dom);

		// getDayOfYear()
		// returns the primitive int value for the day-of-year
		int doy = currentDate.getDayOfYear();
		System.out.println(doy);

		// getMonth()
		// returns the month-of-year field using the Month enum
		Month month = currentDate.getMonth();
		System.out.println(month);

		// getYear()
		// returns the primitive int value for the year
		int year = currentDate.getYear();
		System.out.println(year);

		// getMonthValue()
		// returns the month as an int value from 1 to 12
		int monthValue = currentDate.getMonthValue();
		System.out.println(monthValue);

		// LocalDate.of(year, month, day)
		// returns a LocalDate with the specified year, month and day-of-month
		LocalDate givenDate = LocalDate.of(1947, 8, 15);
		System.out.println(givenDate);
		givenDate = LocalDate.of(1947, Month.AUGUST, 01);
		System.out.println(givenDate);
	}

}
