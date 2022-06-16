package exceptionHandling;

public class TryCatchConcept {

	public static void main(String[] args) {

		try {
			int i = 9 / 0;
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic exception occured");
			e.printStackTrace();
			e.getMessage();
		}

		System.out.println("Coded after the exception");
		System.out.println("----------------");

		try {
			int i = 5 / 0;
		} catch (Exception e) {
			// System.out.println("Null pointer exception");
			e.printStackTrace();
		}

		System.out.println("Code after the second exception");

		try {
			int i = 5 / 0;
		} catch (Throwable e) {
			// System.out.println("Null pointer exception");
			e.printStackTrace();
		} finally {
			System.out.println("If there is any exception or not final block gets always executed");
		}
		System.out.println("Code after the 3rd exception");
	}

}
