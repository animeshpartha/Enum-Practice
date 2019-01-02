package enumexample;

public class WeekDay {
	Week day;
	public WeekDay() {}
	public WeekDay(Week day) {
		this.day = day;
	}
	
	public void WhatIShouldDoToday() {
		switch(day) {
		case Monday:
			System.out.println("Home work is due");
			break;
		case Tuesday:
			System.out.println("Home work is submitted");
			break;
		case Wednesday:
			System.out.println("Home work is done by Adams");
			break;
		case Thursday:
			System.out.println("Home work is finished");
			break;
		case Friday:
			System.out.println("Home work is checked");
			break;
		case Saterday:
			System.out.println("Home work is in Enumurium");
			break;
		case Sunday:
			System.out.println("Home work is OOP");
			break;
		default:
			System.out.println("No more days left of the Week. Thank you");

		}
	}
}
