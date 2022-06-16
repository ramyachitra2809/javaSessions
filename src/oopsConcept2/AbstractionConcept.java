package oopsConcept2;

public class AbstractionConcept {

	public static void main(String[] args) {
		ChildAbstract ca= new ChildAbstract();
		ca.method();
		ca.method1();
		ca.method2();
		ca.test();
		
		//Top casting
		System.out.println("----------------");
		ParentAbstract pa = new ChildAbstract();
		pa.test();
		pa.method();

	}

}
