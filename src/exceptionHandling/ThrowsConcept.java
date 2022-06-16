package exceptionHandling;

public class ThrowsConcept {
	
	public void mul() throws ArithmeticException{
		int a=add()*10;
	}
	
	public int add() throws ArithmeticException{
		int i=10;
		int j=20;
		int k=i+j/0;
		return k;
	}
	
	public static void main (String[] args)  throws ArithmeticException{
		
		ThrowsConcept obj = new ThrowsConcept();
		obj.mul();

	}

}
