package myproject;
import java.util.*;

public class simple {
	
		public static void main(String args[]) {
			System.out.println("enter a no");
			Scanner sc=new Scanner(System.in);
			int val=sc.nextInt();
			System.out.println("enter a num");
			float f=sc.nextFloat();
			System.out.println("enter");
			String s=sc.nextLine();
			System.out.println("enter1");
			String c=sc.next();
			
			System.out.printf("Integer %d%nfloat %f%nnext %s%nnextline %s",val,f,c,s);
		}

}
