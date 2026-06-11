package DecisionMakingAssign;

import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select shape: 1 for Circle, 2 for Square, 3 for Rectangle, 4 for Triangle");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter radius: ");
                double r = sc.nextDouble();
                System.out.println("Area: " + (3.14159 * r * r));
                break;
            case 2:
                System.out.print("Enter side: ");
                double side = sc.nextDouble();
                System.out.println("Area: " + (side * side));
                break;
            case 3:
                System.out.print("Enter length and breadth: ");
                double l = sc.nextDouble();
                double b = sc.nextDouble();
                System.out.println("Area: " + (l * b));
                break;
            case 4:
                System.out.print("Enter base and height: ");
                double base = sc.nextDouble();
                double height = sc.nextDouble();
                System.out.println("Area: " + (0.5 * base * height));
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}