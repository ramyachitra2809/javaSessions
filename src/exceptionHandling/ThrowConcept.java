package exceptionHandling;

public class ThrowConcept {

	public static void main(String[] args) {
		try {
		throw new Exception("Deliberate exceptio");
		}
		catch(Exception e) {
			System.out.println("Handling manual exception");
			e.printStackTrace();
		}

	}

}
