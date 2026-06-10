package OperatorsAssigment;

class SwapWithThird {
    public static void main(String[] args) {
    int a = 10, b = 20, c;
    System.out.println("Before swapping: a = " + a + ", b = " + b);
    c = a;
    a = b;
    b = c;
    System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
