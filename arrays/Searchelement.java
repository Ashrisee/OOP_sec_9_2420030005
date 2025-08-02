package arrays;
import java.util.Scanner;
public class Searchelement {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int[] arr = {10, 20, 30, 40, 50};
	        System.out.print("Enter the element to search: ");
	        int key = sc.nextInt();

	        boolean found = false;

	        for (int val : arr) {
	            if (val == key) {
	                found = true;
	                break;
	            }
	        }

	        if (found) {
	            System.out.println(key + " is present in the array.");
	        } else {
	            System.out.println(key + " is NOT present in the array.");
	        }

	        sc.close();
	    }
}
