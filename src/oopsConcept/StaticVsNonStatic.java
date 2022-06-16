package oopsConcept;

public class StaticVsNonStatic {
	
	int a=10;
	int b=20;
	static int c=40;

	public static void main(String[] args) {
		StaticVsNonStatic obj = new StaticVsNonStatic();
		System.out.println(obj.sum(obj.a, obj.b));
		System.out.println("by direct calling");
		System.out.println(c);
		System.out.println(method2(c,obj.b));
		System.out.println("by using class name");
		System.out.println(StaticVsNonStatic.c);
		System.out.println(StaticVsNonStatic.method2(c, obj.a));
		

	}
	
	public int sum(int x, int y) {
		int z= x+y;
		System.out.println("Non static method");
		return z;
	}
	
	public static int method2(int x, int y) {
		int z= x-y;
		System.out.println("static method");
		return z;
		
	}

}
