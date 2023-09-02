package javaBeginner;

class a{
	public int shashank(){
		return 4;
		
	}
	public void meth2() {
		System.out.println("i am hero");
		
	}
}
class b extends a{
	@Override
	public void meth2() {
		System.out.println("juivc");
	}
}
public class methodoverriding {
	public static void main(String args[]) {
		a A=new a();
		A.meth2();
		
		b B=new b();
		B.meth2();
		
	}

}
