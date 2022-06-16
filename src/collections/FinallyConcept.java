package collections;

public class FinallyConcept {

	public static void main(String[] args) {
		
		try {
			System.out.println("Iside try method1");
			throw new RuntimeException("Error");
		}
		catch(Exception e) {
			System.out.println("Inside catch method1");
		}
		finally {
			System.out.println("Inside finally1");
		}
		
		try {
			System.out.println("Inside try method2");
		}
		catch( ArithmeticException e) {
			System.out.println("Inside catch method2");
		}
		finally {
			System.out.println("Inside finally method2");
		}

		try {
			System.out.println("Inside try method3");
			int i=10;
			int k= i/0;
		}
		catch(NullPointerException e) {
			System.out.println("Inside catch method3");
		}
		finally {
			System.out.println("Inisde finally method3");
		}
	}

}
