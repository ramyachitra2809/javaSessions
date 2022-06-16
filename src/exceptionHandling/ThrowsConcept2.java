package exceptionHandling;

public class ThrowsConcept2 {

		
	public void mul() {
			int a=add()*10;
		}
		
		public int add() throws ArithmeticException{
			int i=10;
			int j=20;
			int k=i+j/0;
			return k;
		}
		
		public static void main (String[] args){
			
			ThrowsConcept obj = new ThrowsConcept();
			try{
				obj.mul();
			}catch(Exception e) {
				e.printStackTrace();
		}
			System.out.println("Code after exception");

	}

}
