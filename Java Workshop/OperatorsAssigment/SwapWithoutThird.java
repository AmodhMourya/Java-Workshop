package OperatorsAssigment;
public class SwapWithoutThird {
	public static void main(String[] args) {
		int a=20, b=60;

	System.out.println("Before swapping: a = " + a);
	System.out.println("Before swapping: b = " + b);
	
	a = a + b;
	b = a - b;
	a = a - b;

	System.out.println("after swapping: a = " + a);
	System.out.println("after swapping: b = " + b);

	}
}
