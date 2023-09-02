package javaBeginner;

  interface cycle{
	void speedup(int increment);
	void speeddoen(int decrement);
}
  interface bike{
	  int nobike(int n);
	  void greeting();
  }
 
class Avon implements cycle{
	int speed=10;
	
	public void speedup(int increment) {
		speed=speed+increment;
		System.out.println("after applying speed is" + speed);
		
	}
	public void speeddoen(int decrement) {
		speed=speed-decrement;
		System.out.println("after applying break speed is" + speed);
	}
	
}
class royal implements bike{
	public int nobike(int n) {
		return n;
	}
	public void greeting() {
		System.out.println("welcome to royal enfeild");
	}
}
//inheritance in interfaces
class mycycle extends Avon implements cycle,bike{
	public void speedup(int increment) {
		System.out.println("this is my cycle speed");		
	}

	@Override
	public int nobike(int n) {
		System.out.println(n);
		return n;
	}

	@Override
	public void greeting() {
		 System.out.println("welcome to royal enfeild");
		
	}
}
public class interfacesinJava {
	public static void main(String args[]) {
		Avon a=new Avon();
		a.speedup(10);
		a.speeddoen(10);
		 mycycle mc=new mycycle();
		 mc.speedup(0);
		 mc.speeddoen(10);	
		 bike r=new royal(); //dynamic method dispatch
		 r.nobike(4);
		 r.greeting();
	}

}
