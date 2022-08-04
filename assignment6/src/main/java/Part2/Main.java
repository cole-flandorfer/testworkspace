package Part2;

public class Main {

	public static void main(String[] args) {
		Thread even =  new Thread(new Even(), "Even");
		Thread odd =  new Thread(new Odd(), "Odd");
		
		odd.start();
		even.start();

	}

}
