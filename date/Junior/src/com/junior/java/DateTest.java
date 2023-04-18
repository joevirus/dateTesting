package com.junior.java;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//declaring my class
class Date {
	private int day;
	private int month;
	private int year;
	private static int maxDaysInMonth;
	
	static {
		Date.maxDaysInMonth = 31;
		System.out.println("Testing ");
		
	}
	
	public Date() {
		this.day = 25;
		this.month = 03;
		this.year = 2023;
	}
	public Date(int day, int month, int year) { //overriding the date
		this.day = day;
		this.month = month;
		this.year = year;
	}
	/*static class DateOperations{
		public void addOne() {
			
		}
		public static void setMaxDaysInMonth(int maxDaysInMonth) {
			Date.maxDaysInMonth = maxDaysInMonth;
		}
	}*/
	public void setDay(int day) {
		this.day = day;
		
	}
	public int getDay() {
		return this.day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return this.day + "/" + this.month + "/" + this.year;
	}
	
}


public class DateTest {

	public static void main(String[] args) {
		//Date.DateOperations.setMaxDaysInMonth(31);
		Date d = new Date();
		Date d2 = new Date(20, 04, 2024);
		System.out.println("Good day, please see the date below");
		/*d.setDay(25);
		d.setMonth(3);
		d.setYear(2023); */
		System.out.println("Day is: " + d);
		System.out.println("Day is: " + d2);
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		String formattedDateTime = now.format(formatter);
		System.out.println("Good day, the current date and time is: " + formattedDateTime);

	} 

}
