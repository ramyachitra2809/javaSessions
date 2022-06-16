package collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class HashSetConcept {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>(Arrays.asList(1,3,5,8,9,0,2));
		System.out.println(hs);
		
		HashSet<Integer> hs1 = new HashSet<Integer>();
		hs1.add(2);
		hs1.add(6);
		hs1.add(8);
		hs1.add(1);
		hs1.add(7);
		System.out.println(hs1);
		
		//intersection
				hs.retainAll(hs1);
				System.out.println(hs);
		
		//union
		hs.addAll(hs1);
		System.out.println(hs);
		
		//difference
		hs.removeAll(hs1);
		System.out.println(hs);
		
		
		

	}

}
