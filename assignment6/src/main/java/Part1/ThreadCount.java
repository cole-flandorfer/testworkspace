package Part1;

public class ThreadCount implements Runnable{

	public void run() {
		for(int i = 1; i <= 50; i++) {
			System.out.println(i);
		}
	}

}
