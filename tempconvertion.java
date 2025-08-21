package co1_assignment;
import java.util.Scanner;
public class tempconvertion {
	   public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter temperature in Celsius (e.g., 36.5): ");
	        String tempStr = sc.next();

	        float tempFloat = Float.parseFloat(tempStr);
	        double tempDouble = Double.parseDouble(tempStr);
	        int tempInt = (int) tempDouble; // explicit cast

	        System.out.println("As float: " + tempFloat);
	        System.out.println("As double: " + tempDouble);
	        System.out.println("As int (truncated): " + tempInt);
	        sc.close();
	    }
}
