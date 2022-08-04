package overriding;

public class Overriding {

	public static void main(String[] args) {
		Incrementor inc = new Incrementor();
		Incrementor even = new DoubleInc();
		
		inc.increment();
		even.increment();
		
		System.out.println("inc total: " + inc.getTotal());
		System.out.println("even total: " + even.getTotal());

	}

}
