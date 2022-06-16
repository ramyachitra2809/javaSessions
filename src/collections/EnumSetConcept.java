package collections;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetConcept {

	enum weekday{
		MON,
		TUE,
		WED,
		THU,
		FRI,
		SAT,
		SUN
	}
	
	public static void main(String[] args) {
		
EnumSet<weekday> es = EnumSet.allOf(weekday.class);
System.out.println(es);

EnumSet<weekday> es1= EnumSet.noneOf(weekday.class);
System.out.println(es1);

EnumSet<weekday> es2= EnumSet.range(weekday.THU, weekday.SAT);
System.out.println(es2);
	
	EnumSet<weekday> es3= EnumSet.of(weekday.FRI);
	System.out.println(es3);
	
	es1.addAll(es3);
	System.out.println(es1);
	
	es1.remove(weekday.FRI);
	System.out.println(es1);
	
	Iterator<weekday> it = es.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
		System.out.println("**********");
		
		for(weekday str : es) {
			System.out.println(str);
		}
	}
	
	
}
