package oopsConcept;

public class Functions {
	
	int p=30;
	int q=40;

	public static void main(String[] args) {
		Functions obj = new Functions();
		obj.method1();
		int j = obj.method2();
		System.out.println(j);
		System.out.println(obj.method3(obj.p,obj.q));
		

	}
	
	public void method1() {
		System.out.println("No Input no output");
	}
	
	public int method2() {
		int a=10;
		int b=20;
		int c= a+b;
		System.out.println("No input but output");
		return c;
	}
	
	public int method3(int x,int y) {
		int z=x+y;
		System.out.println("Input and output");
		return z;
		
	}

}
