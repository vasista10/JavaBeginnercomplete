package javaBeginner;

class negative extends Exception{
	public String tostring() {
		return "iam exception";
	}
}

public class throwVsThrows {
	public static void area(double r) throws negative {
		if(r<0) {
			throw new negative();
		}
		double area=Math.PI*r;
		System.out.println(area);
			}
	public static void main(String args[]) {
		try {
			area(-2);
			
			
		}
		catch(Exception e) {
			System.out.println("no negative");
			
			
			
		}
		
		
		
		
	}

}
