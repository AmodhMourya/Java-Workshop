package DecisionMakingAssign;

import java.util.Scanner;

public class PointLocation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter X and Y coordinates: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x == 0 && y == 0) {
            System.out.println("The point is at the Origin");
        } else if (x == 0) {
            System.out.println("The point lies on the Y-axis");
        } else if (y == 0) {
            System.out.println("The point lies on the X-axis");
        } else {
            System.out.println("The point is in a quadrant at (" + x + ", " + y + ")");
        }
    }
}