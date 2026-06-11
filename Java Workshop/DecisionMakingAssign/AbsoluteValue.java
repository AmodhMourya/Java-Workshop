package DecisionMakingAssign;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Absolute value: " + (-num));
        } else {
            System.out.println("Absolute value: " + num);
        }
    }
}