package myproject;
import java.util.*;
public class date_exmple {
	public static void main(String args[]) {
		Date d = new Date();
		System.out.println("current date is " +d);
		int month=d.getMonth();
		System.out.println("the month is " +month);
		int year=d.getYear();
		System.out.println("year" +year);
		System.out.println(d.getMinutes());
		System.out.println(d.getHours());
	}
//it takes jan as 0 so it gives 6 in place of month when its july(7).
}
