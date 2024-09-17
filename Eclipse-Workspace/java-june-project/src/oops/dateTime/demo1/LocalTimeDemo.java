package oops.dateTime.demo1;

import java.time.LocalTime;

public class LocalTimeDemo {

	public static void main(String[] args) {
		// LocalTime.now()
		// returns the LocalTime object
		// returns the current time from the system clock in the default time zone
		LocalTime currentTime = LocalTime.now();
		System.out.println(currentTime);

		// getHour()
		// returns the hour-of-day, from 0 to 23
		int hour = currentTime.getHour();
		System.out.println(hour);

		// getMinute()
		// returns the minute-of-hour, from 0 to 59
		int minute = currentTime.getMinute();
		System.out.println(minute);

		// getSecond()
		// returns the nano-of-second, from 0 to 999,999,999
		int nano = currentTime.getNano();
		System.out.println(nano);

		// LocalTime.of(hour, minute)
		// returns a LocalTime with the specified hour and minute
		// The second and nanosecond fields will be set to zero
		LocalTime givenTime = LocalTime.of(10, 10);
		System.out.println(givenTime);

		// LocalTime.of(hour, minute, second)
		// returns a LocalTime with the specified hour, minute and second
		// The nanosecond field will be set to zero
		givenTime = LocalTime.of(10, 10, 10);
		System.out.println(givenTime);

		// LocalTime.of(second, minute, second, nanosecond)
		// returns a LocalTime with the specified hour, minute, second and nanosecond
		givenTime = LocalTime.of(10, 10, 10, 123456789);
		System.out.println(givenTime);

	}

}
