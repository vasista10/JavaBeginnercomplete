package javaBeginner;
import java.io.File;
import java.io.IOException;

public class filehandling {
	public static void main(String args[]) {
		File f1=new File("shashank.txt");
		try {
			f1.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("not possible to create"  +e);
		}
		File f2=new File("vasista.txt");
		f2.delete();
		
		
	}

}
