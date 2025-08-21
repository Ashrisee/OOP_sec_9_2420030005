package co1_assignment;
import java.util.Scanner;
public class salesreport {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of salespersons: ");
	        int n = sc.nextInt();
	        System.out.print("Enter number of months: ");
	        int m = sc.nextInt();

	        double[][] sales = new double[n][m];
	        double[] total = new double[n];
	        double[] average = new double[n];

	        for (int i = 0; i < n; i++) {
	            System.out.println("Enter sales for salesperson " + (i + 1) + ":");
	            for (int j = 0; j < m; j++) {
	                sales[i][j] = sc.nextDouble();
	                total[i] += sales[i][j];
	            }
	            average[i] = total[i] / m;
	        }

	        System.out.println("\nSales Report:");
	        for (int i = 0; i < n; i++) {
	            System.out.print("Salesperson " + (i + 1) + " - Monthly: ");
	            for (int j = 0; j < m; j++) {
	                System.out.print(sales[i][j] + " ");
	            }
	            System.out.printf("| Total: %.2f | Avg: %.2f | Performance: %s%n",
	                    total[i], average[i], getPerformance(average[i]));
	        }
	        sc.close();
	    }

	    private static String getPerformance(double avg) {
	        if (avg >= 100000) return "Excellent";
	        else if (avg >= 75000) return "Good";
	        else if (avg >= 50000) return "Average";
	        else return "Poor";
	    }
}
