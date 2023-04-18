package com.junior.java;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeTest {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		String formattedDateTime = now.format(formatter);
		System.out.println("Good day, the current date and time is: " + formattedDateTime);
	}

}
