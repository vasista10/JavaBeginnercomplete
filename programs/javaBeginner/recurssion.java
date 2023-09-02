package javaBeginner;

public class recurssion {
	static int fact(int n) {
		if(n==0) {
			return 1;
		}
		else {
			return n*fact(n-1);
		}
	}
	public static void main(String args[]) {
		int x=5;
		System.out.println("factorial of a no: x \n" + fact(5));
	}
}
