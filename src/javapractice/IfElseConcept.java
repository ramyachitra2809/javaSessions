package javapractice;

public class IfElseConcept {

	public static void main(String[] args) {
		// To find largest of 3 numbers
		
		int a=550;
		int b=500;
		int c=600;
		
		if (a>b & a>c) {
			System.out.println("a is greatest");
		}
		else if  (b>c) {
			System.out.println("b is the greatest");
		}
		else {
			System.out.println("c is the greatest");
		}
	}

}
