package DecisionMakingAssign;
import java.util.Scanner;

public class LargestThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        if (n1 > n2) {
            if (n1 > n3) {
                System.out.println("Largest: " + n1);
            } else {
                System.out.println("Largest: " + n3);
            }
        } else {
            if (n2 > n3) {
                System.out.println("Largest: " + n2);
            } else {
                System.out.println("Largest: " + n3);
            }
        }
    }
}