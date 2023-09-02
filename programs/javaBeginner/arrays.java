 package javaBeginner;

public class arrays {
	public static void main(String args[]) {
	/*	int [] marks=new int[5]; 
		String[] name={"shashank","prakash","vasista"};
		marks[0]=100; 
		System.out.println(marks[0]);
		for(String elements: name) {
			System.out.println(elements);
		}*/
		int [][] flats;
		flats=new int[2][3];
		flats[0][0]=100;
		flats[0][1]=101;
		flats[0][2]=102;
		flats[1][0]=103;
		flats[1][1]=104;
		flats[1][2]=105;
		for(int i=0;i<=flats.length;i++) {
			for(int j=0;j<=flats.length;j++) {
				
			System.out.println(flats[i][j]);
		}
	}
		
		
		}

}
