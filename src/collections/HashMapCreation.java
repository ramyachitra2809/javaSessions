package collections;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapCreation {
	
	public static Map<String,String> m3;
	
	static {
		m3= new HashMap<String,String>();
		m3.put("E", "5");
	}

	public static void main(String[] args) {

     HashMap<String,String> m1= new HashMap<String,String>();
     m1.put("A", "One");
     m1.put("B", "two");
     System.out.println(m1.get("A"));
     
     Map<String,String> m2 = new HashMap<String,String>();
     m2.put("c", "three");
     m2.put("d", "four");
     System.out.println(m2.get("c"));
	
     System.out.println(m3.get("E"));
     
     //immuatable
     Map<String,String> m4= Collections.singletonMap("Key", "Value");
     System.out.println(m4.get("Key"));
     
     Map<String,String> m5 = Stream.of(new String[][] {
    	 {"key1","value1"},
    	 {"key2","value2"},
     }).collect(Collectors.toMap(d->d[0], d->d[1]));
     System.out.println(m5.get("key1"));
     
     //immutable
     Map<String,String> m6= Stream.of(
    		 new AbstractMap.SimpleEntry<>("k4","v4"),
    		 new AbstractMap.SimpleEntry<>("k5","v5")
    		 ).collect(Collectors.toMap(Map.Entry :: getKey,Map.Entry :: getValue));
     		System.out.println(m6.get("k5"));
     		
			/*
			 * Map<String,String> m7= Map.of();
			 * 
			 * Map<String,String> m8= Map.of("k6","v6"); System.out.println(m8.get("k6"));
			 */
     
     
     

	}

}
