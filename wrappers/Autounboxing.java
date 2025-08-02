package wrappers;

public class Autounboxing {
	    public static void main(String[] args) {
	        Integer boxedNum = 200; // autoboxing here

	        // Java automatically unboxes it
	        int num = boxedNum;

	        System.out.println("Auto-unboxed int: " + num);
	    }

}
