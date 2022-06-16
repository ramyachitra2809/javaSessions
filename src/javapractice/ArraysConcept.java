package javapractice;

public class ArraysConcept {

	public static void main(String[] args) {
		
		int i [] = new int[4];
		 i[0]=1;
		 i[1]=2;
		 i[2]=3;
		 i[3]=4;
		
		for (int j=0;j<i.length;j++) {
			System.out.println(i[j]);
		}

		Object ob[] = new Object[5];
		ob[0] = "Hi";
		ob[1] = 12.55;
		ob[2]= 'A';
		ob[3]= 45;
		ob[4]= "1/*5465";
		
		for (int j=0;j<ob.length;j++) {
			System.out.println(ob[j]);
		}
	}

}
