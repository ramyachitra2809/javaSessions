package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class OperationsonArrayList {

	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList(Arrays.asList("Ram","Raj","Chitra","Gaddamidhi"));
		ArrayList<String> ar1 = new ArrayList(Arrays.asList("Ram","Raj","Chitra","Anandas"));
		ar.addAll(ar1);
		System.out.println(ar);
		System.out.println(ar1);
	
		  System.out.println("***************");
		  ar.removeAll(ar1);
		  System.out.println(ar);
		  
		  System.out.println("***************");
		  ar.add("Ram");
		  ar.add("Raj");
		  System.out.println(ar);
		  
		  System.out.println("***************");
		  ar.addAll(1,ar1);
		  System.out.println(ar);
		  
		  System.out.println("*************** to print duplicate elements");
		  ar.retainAll(Collections.singleton("Raj"));
		  System.out.println(ar);
		  
		  System.out.println("***************");
		  Object ar3[] = ar1.toArray();
		  for(Object o : ar3)
			  System.out.println((String)o);
			  
		  System.out.println("***************");
		  ar1.remove("Raj");
		  ar1.remove(2);
		  System.out.println(ar1);
			 
		 
		 
		 
		 
		
		

	}

}
