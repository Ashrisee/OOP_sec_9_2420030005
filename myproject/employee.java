package myproject;
import java.util.*;
public class employee {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		double s=sc.nextDouble();
		int h=sc.nextInt();
		int d=sc.nextInt();
		int p=sc.nextInt();
		double hra=s*h/100;
		double da=s+h/100;
		double pf=s*p/100;
		double gross=s+hra+da;
		System.out.println("gross: "+gross);
		double net=gross-pf+1000;
		System.out.println("Net:"+net);
		if(net>=20000) {
			System.out.println("eligible");
		}
		else {
			System.out.println("not eligible");
		}
		
	
	}

}
