package javaBeginner;

public class stringreverse {
	public static void main(String args[])
	{
		String name="shashank";
		char[] name2=name.toCharArray();
		
		for(int i=name2.length-1;i>=0;i--)
		{
			System.out.print(name2[i]);
		}
		
	}

}
