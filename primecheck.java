package co1_assignment;
import java.util.Scanner;
public class primecheck {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter an integer: ");
	        int num = sc.nextInt();

	        boolean isPrime = true;
	        if (num <= 1) isPrime = false;
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) {
	                isPrime = false;
	                break;
	            }
	        }

	        if (isPrime && num < 100 && num % 2 != 0 && num % 5 != 0) {
	            System.out.println(num + " satisfies all conditions.");
	        } else {
	            System.out.println(num + " does not satisfy all conditions.");
	        }
	        sc.close();
	    }
}
