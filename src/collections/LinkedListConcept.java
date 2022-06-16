package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("10");
		ll.add("Text");
		ll.add("A");
		
		System.out.println("Size of linkedlist:"+ll.size());
		System.out.println("Elements of linkedlist"+ll);
		
		ll.addFirst("Ramya");
		ll.addLast("Anandas");
		System.out.println(ll);
		ll.add(0, "Chitra");
		System.out.println(ll);
		ll.set(0, "Gaddamidhi");
		System.out.println(ll);
		System.out.println(ll.get(2));
		ll.removeFirst();
		System.out.println(ll);
		
		//for loop
		System.out.println("For loop");
		for(int i=0;i<ll.size();i++) {
			System.out.println(ll.get(i));
		}
		
		System.out.println("Advanced For loop");
		for(String str : ll) {
			System.out.println(str);
		}
		
		System.out.println("Iterator");
		Iterator<String> it =ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("While loop");
		int num=0;
		while(ll.size()>num) {
			System.out.println(ll.get(num));
			num++;
		}

	}

}
