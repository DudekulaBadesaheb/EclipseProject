package oops.dateTime.demo1;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class LocalDateTimeDemo {
	public static void main(String[] args) {
		// LocalDateTime.now()
		// returns LocalDateTime object
		// returns the current date-time from the system clock in the default time-zone
		LocalDateTime timestamp = LocalDateTime.now();
		System.out.println(timestamp);

		// getDayOfWeek()
		// returns the day-of-week field, which is an enum DayOfWeek
		DayOfWeek dow = timestamp.getDayOfWeek();
		System.out.println(dow);

		// getDayOfMonth()
		// returns the primitive int value for the day-of-month
		int dom = timestamp.getDayOfMonth();
		System.out.println(dom);

		// getDayOfYear()
		// returns the primitive int value for the day-of-year
		int doy = timestamp.getDayOfYear();
		System.out.println(doy);

		// getHour()
		// returns the hour-of-day from 0 to 23
		int hour = timestamp.getHour();
		System.out.println(hour);

		// getMinute()
		// returns the minute-of-hour, from 0 to 59
		int minute = timestamp.getMinute();
		System.out.println(minute);

		// getSecond()
		// returns the second-of-minute, from 0 to 59
		int second = timestamp.getSecond();
		System.out.println(second);

		// getNano()
		// returns the nano-of-second, from 0 to 999,999,999
		int nano = timestamp.getNano();
		System.out.println(nano);

	}
}
