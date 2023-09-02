package javaBeginner;
import java.util.Scanner;

public class loops {
	public static void main(String args[]) {
		int i=0;
		System.out.println("Enter the value of n:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	/*	do {
			System.out.println(i);
			i++;
		}while(i<=n); */
		
		
		for( i=n;i>=0;i--) {
			System.out.println(i);
			
		}
	}
		
}
