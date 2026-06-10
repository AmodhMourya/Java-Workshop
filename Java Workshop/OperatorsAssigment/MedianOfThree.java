package OperatorsAssigment;

import java.util.Scanner;

class MedianOfThree {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter first number (a): ");
    int a = sc.nextInt();
    System.out.print("Enter second number (b): ");
    int b = sc.nextInt();
    System.out.print("Enter third number (c): ");
    int c = sc.nextInt();
    int median = (a > b) ? 
    ((a < c) ? a : (b > c ? b : c)) : 
    ((b < c) ? b : (a > c ? a : c));
        System.out.println("Median = " + median);
    }
}
