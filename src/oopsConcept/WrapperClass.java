package oopsConcept;

public class WrapperClass {

	public static void main(String[] args) {
		String x="100";
		int i= Integer.parseInt(x);
		System.out.println(i+10);
		
		String y="true";
		Boolean j= Boolean.parseBoolean(y);
		System.out.println(j&false);
		
		int k=12;
		String s= String.valueOf(k);
		System.out.println(s+x);

	}

}
