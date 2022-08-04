package Part2;

public class Odd implements Runnable{
	
	public void run() {
		for(int i = 1; i <= 50; i += 2) {
			System.out.println(i);
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
				Thread.currentThread().interrupt();
			}
		}
	}
}
