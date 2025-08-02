package myproject;
import java.util.*;
public class greatest {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();//greatest among 3 nums
		if(a>b) {
			if(b>c) {
				System.out.println("a is greater");
			}
			else if(c>a) {
				System.out.println("c is greater");
			}
		}
		else if(b>c) {
			System.out.println("b is greater");
		}
		else if(c>b) {
			System.out.println("c is greater");
		}
		int d;//greatest among 2 nums using ternary 
		if(a>b);d=a;d=b;
		System.out.println("greater number is "+d);
	}

}


//2 types of conversions :larger data type to smaller and vice versa .
//widening conversion-automatic type conversion.(smaller to larger).
//narrowing conversion-type casting , manual one .