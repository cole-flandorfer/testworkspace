package Part1;

public class Main {

	public static void main(String[] args) {
		Thread counter =  new Thread(new ThreadCount(), "counter");
		
		counter.start();

	}

}
