package interfaceImplement;

public class InterfaceImplement {

	public static void main(String[] args) {
		Counter acc = new Counter();
		
		System.out.println(acc.getTotal());
		acc.increment();
		acc.increment();
		System.out.println(acc.getTotal());

	}

}
