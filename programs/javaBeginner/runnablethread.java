package javaBeginner;

class c0 implements Runnable{
	public void run() {
		System.out.println("Thread1");	
		System.out.println("Thread1");	
		System.out.println("Thread1");	
		System.out.println("Thread1");	
		System.out.println("Thread1");	
		System.out.println("Thread1");	
		}
}
class c2 implements Runnable{
	public void run() {
		System.out.println("Thread2");	
		System.out.println("Thread2");	
		System.out.println("Thread2");	
		System.out.println("Thread2");	
		System.out.println("Thread2");	
		System.out.println("Thread2");	
	}
}

public class runnablethread {
	public static void main(String args[]) {
		c0 buller1=new c0();
		Thread gun=new Thread(buller1);
		c2 bullet2=new c2();
		Thread gun2=new Thread(bullet2);
		
		gun.start();
		gun2.start();
		
	}

}
