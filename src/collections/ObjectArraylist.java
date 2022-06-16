package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ObjectArraylist {

	public static void main(String[] args) {
		
		Employee e1= new Employee("Ramya",27,"Test");
		Employee e2= new Employee("Chitra",28,"Dev");
		Employee e3= new Employee("Anandas",29,"DevOps");
		
		ArrayList<Employee> ar = new ArrayList<Employee>();
		ar.add(e1);
		ar.add(e2);
		ar.add(e3);
		
		System.out.println(ar.size());
		
		Iterator<Employee> it= ar.iterator();
		while(it.hasNext()) {
			Employee emp=it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		

	}

}
