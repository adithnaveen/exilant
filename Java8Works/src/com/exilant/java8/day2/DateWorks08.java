package com.exilant.java8.day2;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class DateWorks08 {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		
		System.out.println("Today " + today);
		
		LocalDate nextWeek = today.plusWeeks(1);
		System.out.println(nextWeek);
		
		
		LocalDate nextMonth = today.plus(1, ChronoUnit.MONTHS);
		System.out.println("next month " +nextMonth);
		
		System.out.println("In Bengaluru now : " + Clock.systemDefaultZone());
		
		LocalTime time = LocalTime.now(Clock.systemDefaultZone());
		System.out.println("time " + time);
		
		// all the zoneId's 
		// ZoneId.getAvailableZoneIds().forEach(System.out :: println);
		
		ZoneId forLondon = ZoneId.of("Europe/London");
		LocalTime londonTime = LocalTime.now(forLondon);
		
		System.out.println("Time Now in London " + londonTime);
	}
}








