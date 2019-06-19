package Chapter3;
import java.time.*;
public class _14TimeAndDate {
	public static void main(String[] args) {
		
		System.out.println(LocalDate.now());//year-month-day
		System.out.println(LocalTime.now());//h-m-second-nanosecond
		System.out.println(LocalDateTime.now());//LocalDateTLocalTime 
		
		//create date with no time
		//method signatures are like this:
		//public static LocalDate of(int year, int month, int dayOfMonth)
		//public static LocalDate of(int year, Month month, int dayOfMonth)
		LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
		LocalDate date2 = LocalDate.of(2015, 1, 20);
		System.out.println(date1);
		System.out.println(date2);	

		
		//public static LocalDateTime of(int year, int month,
		//int dayOfMonth, int hour, int minute)
		//public static LocalDateTime of(int year, int month,
		//int dayOfMonth, int hour, int minute, int second)
		//public static LocalDateTime of(int year, int month,
		//int dayOfMonth, int hour, int minute, int second, int nanos)
		//public static LocalDateTime of(int year, Month month,
		//int dayOfMonth, int hour, int minute)
		//public static LocalDateTime of(int year, Month month,
		//int dayOfMonth, int hour, int minute, int second)
		//public static LocalDateTime of(int year, Month month,
		//int dayOfMonth, int hour, int minute, int second, int nanos)
		//public static LocalDateTime of(LocalDate date, LocalTime)
		LocalTime time1 = LocalTime.of(6, 15); // hour and minute
		LocalTime time2 = LocalTime.of(6, 15, 30); // + seconds
		LocalTime time3 = LocalTime.of(6, 15, 30, 200); // + nanoseconds
		System.out.println(time1 + "\n" + time2 + "\n" + time3);
		
		LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30);
		LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);
		System.out.println(dateTime2);
		


		//The date and time classes have private constructors 
		//to force you to use the static methods. The exam
		//creators may try to throw something like this at you:
		//LocalDate d = new LocalDate(); // DOES NOT COMPILE

		LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
		
		System.out.println(date); // 2014-01-20
		date = date.plusDays(2);
		System.out.println(date); // 2014-01-22
		date = date.plusWeeks(1);
		System.out.println(date); // 2014-01-29
		date = date.plusMonths(1);
		System.out.println(date); // 2014-02-28
		date = date.plusYears(5);
		System.out.println(date); // 2019-02-28

		LocalDate dater = LocalDate.of(2019, Month.JULY, 30);
		dater=dater.plusMonths(10);
//		LocalTime time = LocalTime.of(5, 15);
//		LocalDateTime dateTime = LocalDateTime.of(dater, time);
//		System.out.println(dateTime); // 2020-01-20T05:15
//		dateTime = dateTime.minusDays(1);
//		System.out.println(dateTime); // 2020-01-19T05:15
//		dateTime = dateTime.minusHours(10);
//		System.out.println(dateTime); // 2020-01-18T19:15
//		dateTime = dateTime.minusSeconds(30);
//		System.out.println(dateTime); // 2020-01-18T19:14:30
		System.out.println(dater);
		
		//Java has a Period class that we can pass in
		Period annually = Period.ofYears(1); // every 1 year
		Period quarterly = Period.ofMonths(3); // every 3 months
		
		LocalDate date5 = LocalDate.of(2015, 1, 20);
		LocalTime time = LocalTime.of(6, 15);
		LocalDateTime dateTime = LocalDateTime.of(date5, time);
		Period period = Period.ofMonths(1);
		System.out.println(date5.plus(period)); // 2015-02-20
		System.out.println(dateTime.plus(period)); // 2015-02-20T06:15
		//System.out.println(time.plus(period)); // UnsupportedTemporalTypeException
	
	}
}
