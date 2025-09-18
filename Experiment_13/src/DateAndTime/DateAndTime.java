package DateAndTime;

import java.time.*;

public class DateAndTime {

	public static void main(String[] args) {

		LocalDate day1 = LocalDate.of(2007, 3, 12), day2 = LocalDate.of(2010, 12, 19);
		LocalTime time1 = LocalTime.of(13, 30), time2 = LocalTime.of(19, 15);
		
		System.out.println("\nDate API Functions:");
		System.out.println(LocalDate.now());
		System.out.println(LocalDate.now().getDayOfMonth());
		System.out.println(LocalDate.now().getMonthValue());
		System.out.println(LocalDate.now().getYear());
		System.out.println(day1.plusDays(5));
		System.out.println(day1.plusMonths(10));
		System.out.println(day1.plusYears(7));
		System.out.println(day2.minusDays(5));
		System.out.println(day2.minusMonths(10));
		System.out.println(day2.minusYears(7));
		System.out.println(day1.isAfter(day2));
		System.out.println(day1.isBefore(day2));
		
		System.out.println("\nTime API Functions:");
		System.out.println(LocalTime.now());
		System.out.println(LocalTime.now().getHour());
		System.out.println(LocalTime.now().getMinute());
		System.out.println(LocalTime.now().getSecond());
		System.out.println(time1.plusHours(5));
		System.out.println(time1.plusMinutes(25));
		System.out.println(time2.minusHours(5));
		System.out.println(time2.minusMinutes(25));
		
		System.out.println("\nPeriod and Duration API Functions:");
		Period period = Period.between(day1, day2);
		System.out.println("Period between day1 and day2: " 
		        + period.getYears() + " years, " 
		        + period.getMonths() + " months, " 
		        + period.getDays() + " days");
		Duration duration = Duration.between(time1, time2);
		long hours = duration.toHours();
		long minutes = duration.toMinutes() % 60;
		System.out.println("Duration between time1 and time2: " + hours + " hours, " + minutes + " minutes");

	}

}
