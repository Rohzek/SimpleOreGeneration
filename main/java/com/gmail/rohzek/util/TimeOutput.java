package com.gmail.rohzek.util;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class TimeOutput 
{
	public static String getTimeTogether()
	{
		LocalDateTime fromDateTime = LocalDateTime.of(2016, 10, 24, 0, 0);
		LocalDateTime toDateTime = LocalDateTime.now();
		LocalDateTime tempDateTime = LocalDateTime.from(fromDateTime);

		long years = tempDateTime.until( toDateTime, ChronoUnit.YEARS);
		tempDateTime = tempDateTime.plusYears(years);

		long months = tempDateTime.until(toDateTime, ChronoUnit.MONTHS);
		tempDateTime = tempDateTime.plusMonths(months);

		// We're not actually going to use Days.
		long days = tempDateTime.until( toDateTime, ChronoUnit.DAYS);
		tempDateTime = tempDateTime.plusDays(days);
		
		String partOne = years > 1 ? years + " years" : years == 1 ? years + " year" : "";
		String partTwo = years > 0 && months > 0 ? " and " : "";
		String partThree = months > 1 ? months + " months" : months == 1 ? months + " month" : "";
		String partFour = " together. <3";
		
		String output = partOne + partTwo + partThree + partFour;
		
		return output;
	}
}