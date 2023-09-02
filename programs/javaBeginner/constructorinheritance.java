package javaBeginner;

class base1{
	base1(){
		System.out.println("juice kudi");
		
	}
	base1(int a ,int b){
		System.out.println("shata teri" + a + b);
	}
	public int x;
	public int getX() {
		return x;
		
	}
	public void setX(int x) {
		this.x=x;
	}
}
class derived extends base1{
	derived(){
		System.out.println("8055");
			
		}
	derived(int x, int y){
		super(x,y);
		System.out.println("i am overloaded");
		
	}
	public int y;
	public int gety() {
		return y;
		
	}
	public void sety(int y) {
		this.y=y;
	}
}
	
public class constructorinheritance {
	public static void main(String args[]) {
	derived d=new derived(1,1);
		
	}

}
