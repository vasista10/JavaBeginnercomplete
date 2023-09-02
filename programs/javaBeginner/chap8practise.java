package javaBeginner;
import java.util.Scanner;

	class worker{
		int salary1;
		String name;
		 public int getSalary() {
			 return salary1;
			 
		 }
		 public void getname() {
			 System.out.println(name);
		 }
		 public void setNmae() {
			 String name2;
			 System.out.println("Enter new name");
			 Scanner sc=new Scanner(System.in);
			 name2=sc.nextLine();
			 System.out.println("new name is:" + name2);
		 }
	}
public class chap8practise {
	public static void main(String args[]) {
		worker e=new worker();
		e.name="shashank";
		e.salary1=10000;
		int sal=e.getSalary();
		System.out.println(sal);
		e.getname();
		e.setNmae();
		
	}
	

}
