package javaBeginner;
import java.util.Scanner;

public class student {
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your total marks out of 600");
			float total=sc.nextFloat();
			float percentage=((total)/600)*100;
			System.out.println("Percentage of student is");
			System.out.println(percentage);
			
		}
}
