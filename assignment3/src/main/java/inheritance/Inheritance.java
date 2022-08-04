package inheritance;

public class Inheritance {

	public static void main(String[] args) {
		Counter acc = new Counter(); //Counter inherits increment and getTotal from Incrementor
		acc.increment();
		acc.increment();
		acc.decrement();
		System.out.println(acc.getTotal());
		
	}

}
