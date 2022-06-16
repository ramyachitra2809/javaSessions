package collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;


public class VectorConcept {

	public static void main(String[] args) {
		Vector<Integer> vec=new Vector<Integer>(Arrays.asList(1,2,3,4));
		System.out.println(vec);
		
		Vector<Integer> vec1=new Vector<Integer>();
		vec1.add(5);
		vec1.add(6);
		vec1.add(7);
		vec1.add(8);
		vec1.add(9);
		
		Iterator<Integer> it = vec1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//2d vector
		
		Vector vec2= new Vector();
		vec2.add(vec1);
		System.out.println("************");
		for(int i=0;i<vec1.size();i++) {
			int k= (Integer)((Vector)(vec2.get(0))).get(i);
			System.out.println(k);
		}

	}

}
