package arrays;

public class minandmax {
	    public static void main(String[] args) {
	        int[] arr = {25, 11, 7, 75, 56};

	        int min = arr[0];
	        int max = arr[0];

	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] < min)
	                min = arr[i];
	            if (arr[i] > max)
	                max = arr[i];
	        }

	        System.out.println("Smallest element: " + min);
	        System.out.println("Largest element: " + max);
	    }
}
