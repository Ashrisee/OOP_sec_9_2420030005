package arrays;
import java.util.*;
public class Removeduplicates {
	    public static void main(String[] args) {
	        int[] arr = {10, 20, 20, 30, 40, 40, 50};

	        Set<Integer> unique = new LinkedHashSet<>();

	        for (int val : arr) {
	            unique.add(val);  // Automatically removes duplicates
	        }

	        System.out.println("Unique elements:");
	        for (int val : unique) {
	            System.out.print(val + " ");
	        }
	   }
}
