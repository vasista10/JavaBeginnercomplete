package javaBeginner;
import java.util.Scanner;

class inputException extends Exception{
	public String getString() {
		return "error in the input";
	}
}
public class customCalcUsingException {
	public static int sum(int a,int b) throws inputException{
		if(a<=0||b<=0) {
			throw new inputException();
		}
		int res=a+b;
		System.out.println(res);
		return res;
	}
	public static int sub(int a,int b) throws inputException{
		if(a<=0||b<=0)  {
			throw new inputException();
		}
		int res=a-b;
		System.out.println(res);
		return res;

	
	}
	public static int mul(int a,int b) throws inputException{
		if(a<=0||b<=0) {
			throw new inputException();
		}

		int res=a*b;
		System.out.println(res);
		return res;
	}
	public static int div(int a,int b) throws inputException{
		if(a<=0||b<=0)  {
			throw new inputException();
		}

		int res=a/b;
		System.out.println(res);
		return res;
	}
	public static void main(String args[]) {
		customCalcUsingException cc=new customCalcUsingException();
		
	
		try {
			cc.sum(4,4);
			cc.sub(5,4);
			cc.mul(5,5);
			cc.div(6,2);
			
		}
		catch(Exception e) {
			System.out.println("all operarions not possible");
		}
		
		
	
		
	}

}
