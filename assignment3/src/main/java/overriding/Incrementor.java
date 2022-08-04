package overriding;

public class Incrementor {
	protected int total;
	
	Incrementor() {
		total = 0;
	}
	
	public void increment() {
		total++;
	}
	
	public int getTotal() {
		return total;
	}
}