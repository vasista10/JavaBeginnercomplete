package javaBeginner;
import java.util.*;

public class arraylist {
	public static void main(String args[]) {
		ArrayList<Integer> l1 =new ArrayList<>();
		ArrayList<Integer> l2 =new ArrayList<>();
		l1.add(5);
		l1.add(10);
		l1.add(54);
		l1.add(89);
		l2.add(59);
		l2.add(58);
		l2.add(54);
		l2.add(55);
		l2.addAll(l1);
		l1.set(1, 400);
		System.out.println("contents of l1" + l1 );
		System.out.println("contents of l2" + l2 );
		
		
	}

}
