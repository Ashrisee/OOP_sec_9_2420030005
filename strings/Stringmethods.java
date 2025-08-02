package strings;

public class Stringmethods {
	    public static void main(String[] args) {
	        String str = "  Java Programming  ";

	        System.out.println("Original: '" + str + "'");
	        System.out.println("Trimmed: '" + str.trim() + "'");
	        System.out.println("Uppercase: " + str.toUpperCase());
	        System.out.println("Lowercase: " + str.toLowerCase());
	        System.out.println("Length: " + str.length());
	        System.out.println("Character at index 5: " + str.charAt(5));
	        System.out.println("Substring (5 to 15): " + str.substring(5, 15));
	        System.out.println("Contains 'Program': " + str.contains("Program"));
	        System.out.println("Replaced 'Java' with 'C++': " + str.replace("Java", "C++"));
	    }
}

