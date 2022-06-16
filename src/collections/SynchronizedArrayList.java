package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {

	public static void main(String[] args) {
		List<String> ar = Collections.synchronizedList(new ArrayList<String>());
		ar.add("Ram");
		ar.add("Raj");
		ar.add("Chitra");
		
		synchronized(ar) {
			Iterator<String> it= ar.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		}
		
		System.out.println("****************");
		CopyOnWriteArrayList<String> ca= new CopyOnWriteArrayList<String>(Arrays.asList("A","B","C"));
		for(String s: ca) {
			System.out.println(s);
		}
		
	}

}
