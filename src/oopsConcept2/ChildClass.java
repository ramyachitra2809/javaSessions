package oopsConcept2;

public class ChildClass extends ParentClass{

	String name;
	int age;
	
	public ChildClass() {
		System.out.println("This is child default const");
	}
	
	public ChildClass( String name,int age) {
		System.out.println("Para const");
		this.name=name;
		this.age=age;
	}
	
	public ChildClass(int i) {
		super(20);
		System.out.println("Child single para value of i :"+i);
	}
	
	
}
