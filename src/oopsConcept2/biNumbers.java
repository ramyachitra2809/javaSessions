package oopsConcept2;

public class biNumbers {
	private int i, j;

	public biNumbers(int i, int j) {
		this.i = i;
		this.j = j;
	}

	public int geti() {
		return i;
	}

	public void seti(int i) {
		this.i = i;
	}

	public int getj() {
		return j;
	}

	public void setj(int j) {
		this.j = j;
	}

	public int addNum() {
		return i + j;
	}

	public int multiplyNum() {
		return i * j;
	}

	public void doubleNum() {
		this.i = i * 2;
		this.j = j * 2;
	}

	public static void main(String[] args) {
		biNumbers num = new biNumbers(9, 3);
		System.out.println(num.addNum());
		System.out.println(num.multiplyNum());
		num.doubleNum();
		System.out.println(num.geti());
		System.out.println(num.getj());

	}

}
