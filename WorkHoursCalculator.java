package co1_assignment;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class WorkHoursCalculator {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter start time (HH:mm): ");
	        String startStr = sc.next();
	        System.out.print("Enter end time (HH:mm): ");
	        String endStr = sc.next();

	        LocalTime start = LocalTime.parse(startStr);
	        LocalTime end = LocalTime.parse(endStr);

	        Duration duration;
	        if (end.isBefore(start)) {
	            // end is next day
	            duration = Duration.between(start, end.plusHours(24));
	        } else {
	            duration = Duration.between(start, end);
	        }

	        long hours = duration.toHours();
	        long minutes = duration.toMinutes() % 60;

	        System.out.println("Total worked: " + hours + " hours and " + minutes + " minutes.");
	        sc.close();
	    }
}



