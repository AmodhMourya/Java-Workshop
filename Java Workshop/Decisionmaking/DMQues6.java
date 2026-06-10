package Decisionmaking;

public class DMQues6 {

	public static void main(String[] args) {
		int a=10,b=5;
		if(a++>b--) { 
			System.out.println(a+b);
		}else {
			a++;
		}
		System.out.println(""+a+b);
	}

}
