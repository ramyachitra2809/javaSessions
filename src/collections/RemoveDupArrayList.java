package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDupArrayList {

	public static void main(String[] args) {
		ArrayList<String> ar= new ArrayList<String>(Arrays.asList("Raj","Ram","Chitra","Ram"));
		ArrayList<String> ar1= new ArrayList<String>(Arrays.asList("Gaddamidhi","Ram","Mahi","MAHI","Mahi"));
		
		//comparision
		Collections.sort(ar);
		Collections.sort(ar1);
		
		System.out.println(ar.equals(ar1));
		ar.retainAll(ar1);
		System.out.println(ar);
		System.out.println(ar1);
		
		//Remove duplicate elements
		LinkedHashSet<String> lh= new LinkedHashSet<String>(ar);
		ArrayList<String> dup= new ArrayList<String>(lh);
		System.out.println(dup);
		
		List<String> ll=  ar1.stream().distinct().collect(Collectors.toList());
		System.out.println(ll);
		
		
	}

}
