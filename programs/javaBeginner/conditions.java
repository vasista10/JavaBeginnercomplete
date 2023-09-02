package javaBeginner;
import java.util.Scanner;

public class conditions {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of x");
		int x=sc.nextInt();
		switch (x) {
	    case 1 -> System.out.println("One");
	    case 2 -> System.out.println("Two");
	    default -> System.out.println("not possible");
	}
		
	}
	
}
