package javaBeginner;

public class finallyKeyword {
	public static  int divide(int a,int b) {
		int d;
		try {
			d=a/b;
			System.out.println(d);
		}
		catch(Exception e) {
			System.out.println("caught exception");
			
		}
		finally {
			System.out.println("iam always excueted");
		}
		return -1;
	}

	public static void main(String args[]) {
		int res=divide(5,0);
		
	}

}
