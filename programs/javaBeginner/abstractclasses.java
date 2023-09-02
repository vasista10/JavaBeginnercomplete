package javaBeginner;

abstract class  juice{
	int fruit=10;
	public int fruits() {
		
		return fruit;
	}
	abstract void bill();
	abstract void item();
	
}
class outlet extends juice{
	
	
	@Override
	void bill() {
		System.out.println("this is bill");
		
	}

	@Override
	void item() {
		int n=10;
		System.out.println("no of item= \t" + n);
		
	}
	
	
}
public class abstractclasses {
	public static void main(String args[]) {
		outlet o=new outlet();
		o.bill();
		o.fruits();
		o.item();
	}

}
