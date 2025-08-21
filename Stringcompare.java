package co1_assignment;

public class Stringcompare {
	    public static void main(String[] args) {
	        String str1 = "Hello World";
	        String str2 = "hello world";
	        String str3 = "Hello World";

	        System.out.println("str1 == str2: " + (str1 == str2));
	        System.out.println("str1 == str3: " + (str1 == str3));
	        System.out.println("str1.equals(str2): " + str1.equals(str2));
	        System.out.println("str1.equals(str3): " + str1.equals(str3));
	        System.out.println("str1.compareTo(str2): " + str1.compareTo(str2));
	        System.out.println("str2.compareTo(str3): " + str2.compareTo(str3));
	    }
}
