package oopsConcept2;

public class ConstructorConcept {

	public ConstructorConcept() {
		System.out.println("default constructor");
	}

	public ConstructorConcept(int i) {
		System.out.println("single para connstructor");
	}

	public ConstructorConcept(int i, int j) {
		System.out.println("2 para constructor");
	}

	public static void main(String args[]) {
		ConstructorConcept obj = new ConstructorConcept();
		ConstructorConcept obj1 = new ConstructorConcept(10);
		ConstructorConcept obj2 = new ConstructorConcept(10, 20);

	}
}
