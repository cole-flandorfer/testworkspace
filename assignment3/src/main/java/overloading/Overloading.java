package overloading;

public class Overloading {

	public static void printO(int i) {
		System.out.println("Method called with just one parameter: " + i);
	}
	
	public static void printO(int i, int j) {
		System.out.println("Method called with two parameters: " + i + ", and " + j);
	}
	
	public static void main(String[] args) {
		printO(6);
		printO(38);
		printO(42, 85);
		printO(2, 367);

	}

}
