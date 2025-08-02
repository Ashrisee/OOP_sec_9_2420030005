package myproject;
import java.util.*;
public class randomprac {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		//sum of n natural numbers 
		int n = sc.nextInt();
		int s=0;
		for(int i=1;i<=n;i++) {
			s=s+i*i;
		}
		System.out.println("sum of squares = "+s);
		//sum of digits 
		int N =sc.nextInt();
		int d =0;
		while(N>0) {
			int r=N%10;
			d=d+r;
			N=N/10;
		}
		System.out.println("sum of digits = "+d);
		//pattern
		int w=sc.nextInt();
		while(w>0) {
			for(int i=1;i<=w;i++) {
				System.out.printf("%d ",i);
			}
			w--;
			System.out.printf("\n");
		}
		
	}

}
