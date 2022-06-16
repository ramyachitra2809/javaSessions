package oopsConcept;

public class CallbyValueAndReference {
	int a=10;
	int b=20;

	public static void main(String[] args) {
		CallbyValueAndReference obj = new CallbyValueAndReference();
		System.out.println("call by value");
		System.out.println(obj.sum(obj.a, obj.b));
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println("call by reference");
		obj.swap(obj);
		System.out.println(obj.a);
		System.out.println(obj.b);
		
		

	}
	
	public int sum(int x, int y) {
		int z= x+y;
		return z;
	}
	
	public void swap(CallbyValueAndReference obj) {
		int temp = obj.a;
		obj.a=obj.b;
		obj.b=temp;
	}

}
