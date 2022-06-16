package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapComparision {

	public static void main(String[] args) {
		
		HashMap<Integer,String> m1 = new HashMap<Integer,String>();
		m1.put(1, "A");
		m1.put(2, "B");
		m1.put(3, "C");
		m1.put(3, "D");
		
		HashMap<Integer,String> m2 = new HashMap<Integer,String>();
		m2.put(1, "A");
		m2.put(2, "B");
		m2.put(3, "C");
		m2.put(4, "C");
		m2.put(5, null);
		m2.put(null, "D");
		
		
		//printing hashmap
		Iterator<Integer> it=  m1.keySet().iterator();
		while(it.hasNext()) {
			Integer key= it.next();
			String value=m1.get(key);
			System.out.println("Key"+key+"Value"+value);
		}
		
		System.out.println("**************");
		
		Iterator<Entry<Integer,String>> it1  = m2.entrySet().iterator();
		while(it1.hasNext()) {
			Entry<Integer,String> en= it1.next();
			System.out.println("Key"+en.getKey()+"Value"+en.getValue());
		}
		System.out.println("**************");
		m2.forEach((k,v)->System.out.println("k"+k+"v"+v));
		
		//using equals 
		System.out.println(m1.equals(m2));
		
		//using keyset
		System.out.println("**************");
		System.out.println(m1.keySet().equals(m2.keySet()));
		
		//printing other keys
		System.out.println("**************");
		HashSet<Integer> keys = new HashSet<Integer>(m1.keySet());
		keys.addAll(m2.keySet());
		keys.removeAll(m1.keySet());
		System.out.println(keys);
		
		
		
		
		
		
	}

}
