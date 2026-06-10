package operators;

public class LogicalPrecedence {
    public static void main(String[] args) {
        // Variables
        boolean a = true;
        boolean b = false;
        boolean c = true;

        // Example 1: AND has higher precedence than OR
        boolean result1 = a || b && c; // Equivalent to a || (b && c)
        System.out.println("Result of a || b && c: " + result1);

        // Example 2: Parentheses to change precedence
        boolean result2 = (a || b) && c; // Explicitly (a || b) first
        System.out.println("Result of (a || b) && c: " + result2);

        // Example 3: Mixing logical AND and OR
        boolean result3 = a && b || c; // Equivalent to (a && b) || c
        System.out.println("Result of a && b || c: " + result3);

        // Example 4: Explicit parentheses for clarity
        boolean result4 = a && (b || c); // Explicitly (b || c) first
        System.out.println("Result of a && (b || c): " + result4);
        
        
     // Variables
//        int a=10;
//        int b=20;
//        int c=30;  	
//    	
//        boolean result1 = ++a<b || ++b>c && ++c>b; 
//        System.out.println("Result of a || b && c: " + result1);
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
    }
}