package DecisionMakingAssign;

import java.util.Scanner;

public class UnitConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select conversion: 1 for km to m, 2 for m to cm, 3 for cm to mm");
        int choice = sc.nextInt();
        System.out.print("Enter value to convert: ");
        double value = sc.nextDouble();

        switch (choice) {
            case 1:
                System.out.println(value + " km = " + (value * 1000) + " m");
                break;
            case 2:
                System.out.println(value + " m = " + (value * 1000) + " cm");
                break;
            case 3:
                System.out.println(value + " cm = " + (value * 10) + " mm");
                break;
            default:
                System.out.println("Invalid conversion choice");
        }
    }
}