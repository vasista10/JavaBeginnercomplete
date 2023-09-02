package javaBeginner;

class class1 extends Thread{
	
		@Override
		public void run() {
				System.out.println("class 1 thread");
		}
	}
	
class class2 extends Thread{
	@Override
	public void run() {
		System.out.println("class 2 thread");
	}
	
}
	
public class threadExtends {
	public static void main(String args[]) {
		class1 t1=new class1();
		class2 t2=new class2();
		t1.start();
		t2.start();
	}

}
