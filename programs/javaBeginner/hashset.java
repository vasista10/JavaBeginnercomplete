package javaBeginner;
import java.util.ArrayDeque;
import java.util.HashSet;

public class hashset {
	public static void main(String args[]) {
		HashSet<Integer> l1 =new HashSet<>();
		HashSet<Integer> l2 =new HashSet<>();
		l1.add(5);
		l1.add(10);
		l1.add(54);
		l1.add(89);
		l2.add(59);
		l2.add(58);
		l2.add(54);
		l2.add(55);
		l2.addAll(l1);
	//	l1.addFirst(500);  these methos not possible in hashsets
		//l1.addLast(66);
		//l2.addFirst(90);
		//l2.addLast(88);
		// l1.set(1, 400); set method is not possible in arraydeque
		System.out.println("contents of l1" + l1 );
		System.out.println("contents of l2" + l2 );
		
	}

}
