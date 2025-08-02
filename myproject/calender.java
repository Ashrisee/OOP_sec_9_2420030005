package myproject;
import java.util.*;
public class calender {
	public static void main(String args[]) {
		Calendar c = Calendar.getInstance();
		Date d =c.getTime();
		System.out.println(d);
		c.set(2025,c.JULY,23);
		int year=c.getWeekYear();
		System.out.println(year);
		int h=c.getFirstDayOfWeek();
		System.out.println(h);
		System.out.println("day of week : "+c.get(Calendar.DAY_OF_WEEK));
		System.out.println("day of year : "+c.get(Calendar.DAY_OF_YEAR));
		System.out.println("week in month : "+c.get(Calendar.WEEK_OF_MONTH));
		System.out.println("week in year : "+c.get(Calendar.WEEK_OF_YEAR));
		System.out.println("day of week in month : "+c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("hour : "+c.get(Calendar.HOUR));
		System.out.println("minute : "+c.get(Calendar.MINUTE));
		System.out.println("Second : "+c.get(Calendar.SECOND));
		System.out.println("AM OR PM : "+c.get(Calendar.AM_PM));
		System.out.println("24check : "+c.get(Calendar.HOUR_OF_DAY));


	}

}
