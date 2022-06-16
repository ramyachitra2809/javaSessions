package oopsConcept;

public class MethodOverloading {

	int a =10;
	int b= 20;
	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		System.out.println(obj.sum(obj.a));
		System.out.println(obj.sum(obj.a,obj.b));

	}
	
	public int sum(int x) {
		return x+10;
	}
	
	public int sum(int x, int y) {
		int z= x+y;
		return z;
	}
	 

}
