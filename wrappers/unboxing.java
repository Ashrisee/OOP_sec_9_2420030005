package wrappers;

public class unboxing {
	    public static void main(String[] args) {
	        Integer boxedNum = Integer.valueOf(100);

	        // Manual unboxing
	        int num = boxedNum.intValue();

	        System.out.println("Unboxed int: " + num);
	    }

}
