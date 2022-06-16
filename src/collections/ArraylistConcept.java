package collections;

import java.util.ArrayList;
import java.util.Iterator;


public class ArraylistConcept {

	public static void main(String[] args) {
		
		//Non generic arraylist
		
		ArrayList ar = new ArrayList();
		ar.add(10);
		ar.add("Test");
		ar.add(true);
		
		System.out.println("size of arraylist:"+ar.size());
		
		//Generic array
		
		ArrayList<String> ar1= new ArrayList<String>();
		ar1.add("Ramya");
		ar1.add("chitra");
		ar1.add("Anandas");
		ar1.add("Test");
		System.out.println("size of arraylist1:"+ar1.size());
		
	//pritning values of arraylist
	
	for(int i =0;i<ar.size();i++) {
		System.out.println(ar.get(i));
	}
	
	//iterator
	
	Iterator it= ar.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}

	
	//operations on arraylist
	
	ar.retainAll(ar1);
	System.out.println("Retain same elements ");
	for(int i =0;i<ar.size();i++) {
		System.out.println(ar.get(i));
	}
	
	ar.addAll(ar1);
	System.out.println("AddAll");
	for(int i =0;i<ar.size();i++) {
		System.out.println(ar.get(i));
	}
	
	ar.removeAll(ar1);
	System.out.println("Remove All");
	for(int i =0;i<ar.size();i++) {
		System.out.println(ar.get(i));
	}
	
	
	
}
}
