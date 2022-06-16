package collections;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		Hashtable<String,String> ht= new Hashtable<String,String>();
        ht.put("k1", "v1");
        ht.put("k2", "v2");
        System.out.println(ht);
        System.out.println(ht.get("k2"));
	}

}
