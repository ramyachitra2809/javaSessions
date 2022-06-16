package oopsConcept2;

public class SingletonConcept {

	public String name;
	private static SingletonConcept s1 = null;

	private SingletonConcept() {
		name = "ramya";
	}

	public static SingletonConcept instance() {
		if (s1 == null)
			s1 = new SingletonConcept();
		return s1;
	}

	public static void main(String[] args) {
		SingletonConcept sc = SingletonConcept.instance();
		SingletonConcept sc1 = SingletonConcept.instance();
		SingletonConcept sc2 = SingletonConcept.instance();
		sc.name = (sc.name).toUpperCase();
		System.out.println(sc.name);
		System.out.println(sc1.name);
		System.out.println(sc2.name);

	}

}
