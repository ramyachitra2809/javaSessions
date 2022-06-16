package javapractice;

public class StringConcatenation {

	public static void main(String[] args) {
		
		int i= 10;
		int j= 20;
		
		String x= "hello";
		String y = "world";
		
		System.out.println(i+j);
		System.out.println(x+y);
		System.out.println(i+j+x+y);
		System.out.println(x+y+i+j);
		System.out.println(x+y+(i+j));
		System.out.println("The End");

	}

}
