package javaBeginner;

public class varArgs {
	static int sum(int x,int ...arr) {
		 int result=0;
		 for(int a:arr) {
			 result +=a;
			 x=x+result;
		 }
		 return x;
	}
	public static void main(String args[]) {
		System.out.println("varargs");
		System.out.println("sum of 3 and 3 \t" + sum(3,3,4,5));
		
	}

}
