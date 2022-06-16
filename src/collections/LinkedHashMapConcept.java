package collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class LinkedHashMapConcept {

	public static void main(String[] args) {
		LinkedHashMap<String,String> lhm= new LinkedHashMap<String,String>();
		lhm.put("k1", "v1");
		lhm.put("k2", "v2");
		lhm.put("k3", null);
		lhm.put("k4", null);
		lhm.put("k4", "v4");
		lhm.put(null, "v1");
		System.out.println(lhm);
		
		LinkedHashMap<String,String> lhm1 = new LinkedHashMap<String,String>();
		lhm1.put("k5", "v5");
		lhm1.put("k6", null);
		
		Iterator<String> it= lhm.keySet().iterator();
		while(it.hasNext()) {
			String str= it.next();
			System.out.println(str);
			System.out.println(lhm.get(str));
		}
		
		

	}

}
