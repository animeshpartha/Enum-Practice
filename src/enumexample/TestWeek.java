package enumexample;

public class TestWeek {

	public static void main(String[] args) {
		WeekDay day1 = new WeekDay(Week.Monday);
		day1.WhatIShouldDoToday();

		WeekDay day2 = new WeekDay(Week.Tuesday);
		day2.WhatIShouldDoToday();
		
		WeekDay day3 = new WeekDay(Week.Wednesday);
		day3.WhatIShouldDoToday();
		
		WeekDay day4 = new WeekDay(Week.Thursday);
		day4.WhatIShouldDoToday();
		
		WeekDay day5 = new WeekDay(Week.Friday);
		day5.WhatIShouldDoToday();
		
		WeekDay day6 = new WeekDay(Week.Saterday);
		day6.WhatIShouldDoToday();
		
		WeekDay day7 = new WeekDay(Week.Sunday);
		day7.WhatIShouldDoToday();
		
		WeekDay day8 = new WeekDay(Week.noday);
		day8.WhatIShouldDoToday();
	}
}
