package oopsConcept2;

public class TestBank {

	public static void main(String[] args) {
		
		HSBCBank h= new HSBCBank();
		h.credit();
		h.debit();
		h.moneytransfer();
		System.out.println(HSBCBank.min_bal);

	}

}
