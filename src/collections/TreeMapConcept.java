package collections;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapConcept {

	public static void main(String[] args) {
		TreeMap<String,String> tm=new TreeMap<String,String>(Comparator.reverseOrder());
		tm.put("k1", null);
		tm.put("k2", "v2");
		tm.put("one", "v1");
		tm.put("two", "tedst");
		tm.put("alpha", "beta");
		System.out.println(tm);
		System.out.println(tm.lastKey());
		System.out.println(tm.firstKey());
		
		Set<String> keyset1= tm.headMap("one").keySet();
		System.out.println(keyset1);
		
		Set<String> keyset2= tm.tailMap("k2").keySet();
		System.out.println(keyset2);
		
		
		

	}

}
