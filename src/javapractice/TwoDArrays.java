package javapractice;

public class TwoDArrays {

	public static void main(String[] args) {
		String x[][] = new String [2][3];
		x[0][0] = "1";
		x[0][1] = "2";
		x[0][2] = "3";	
		x[1][0] = "4";
		x[1][1] = "5";
		x[1][2] = "6";
		
		for (int i=0;i<x.length;i++) {
			for (int j=0;j<x[0].length;j++) {
				System.out.print(x[i][j]);
			}
			System.out.println();
		}
		
		

	}

}
