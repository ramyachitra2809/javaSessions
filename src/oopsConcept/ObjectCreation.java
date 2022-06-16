package oopsConcept;

public class ObjectCreation {
	int a=10;
	int b,c;
	

	public static void main(String[] args) {
		ObjectCreation obj= new ObjectCreation();
		obj.b=obj.a+10;
		obj.c=30;
		System.out.println(obj.sum(obj.b, obj.c));
		

	}
	
	public int sum(int b,int c) {
		int y=b+c;
		return y;
	}

}
