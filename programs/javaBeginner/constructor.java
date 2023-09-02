package javaBeginner;

public class constructor {
	public constructor(int x,String myname) {
		int id= x;
		String name=myname;
		System.out.println(id);
		System.out.println(name);
	}
	
	public static void main(String args[]) {
		constructor cd=new constructor(10,"shashank");
		System.out.println();	}

}
