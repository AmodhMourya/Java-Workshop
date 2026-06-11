package DecisionMakingAssign;
import java.util.Scanner;

public class GreatestFourNested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter four numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if (a >= b) {
            if (a >= c) {
                if (a >= d) {
                    System.out.println("Greatest: " + a);
                } else {
                    System.out.println("Greatest: " + d);
                }
            } else {
                if (c >= d) {
                    System.out.println("Greatest: " + c);
                } else {
                    System.out.println("Greatest: " + d);
                }
            }
        } else {
            if (b >= c) {
                if (b >= d) {
                    System.out.println("Greatest: " + b);
                } else {
                    System.out.println("Greatest: " + d);
                }
            } else {
                if (c >= d) {
                    System.out.println("Greatest: " + c);
                } else {
                    System.out.println("Greatest: " + d);
                }
            }
        }
    }
}