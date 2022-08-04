package interfaceImplement;

public class Counter implements Incrementor{
	private int total;
	
	public void increment() {
		total++;
	}
	
	public int getTotal() {
		return total;
	}
}
