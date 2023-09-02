package javaBeginner;

class myclass extends Thread{
	public myclass(int n) {
		super();
		System.out.println("thread1" + n);
	}
	public void run() {
		System.out.println("thread1class");
	}
}
public class threadConstructor {
	public static void main(String args[]) {
	
	myclass t1=new myclass(4);
	myclass t2=new myclass(10);
	myclass t6=new myclass(11);
	myclass t5=new myclass(15);
	myclass t4=new myclass(18);
	myclass t3=new myclass(100);
	
	t4.setPriority(Thread.MAX_PRIORITY);
	
	t1.start();
	t2.start();
	t3.start();
	t4.start();
	t5.start();
	t6.start();
	
	try {
		t3.sleep(200);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("thread id= " + t1.getId());
	

 }
}

