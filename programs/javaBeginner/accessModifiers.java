package javaBeginner;

class c1{
	public int a=50;
	protected int b=90;
	 int n=454;
	
	int value() {
		return a;
	}
	
	
	
}

public class accessModifiers {
	public static void main(String args[]) {
		c1 c=new c1();
		// does not happen beacuse it is private System.outprintln("value of n=" + c.n);
		System.out.println("value of n=" + c.n);
		System.out.println("value of b=" + c.b);
		System.out.println("value of a=" + c.value());
	}
		
}
