package collections;

public class FinalizeConcept {
	
	public void finalize() {
		System.out.println("This method is used for cleanup process and called before gc");
	}

	public static void main(String[] args) {
		ChildClass cc= new ChildClass();
		ChildClass cc1= new ChildClass();
		
		cc=null;
		cc1=null;
		System.out.println("Test");
	System.gc();
		

	}
	
	

}
