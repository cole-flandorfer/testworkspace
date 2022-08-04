package Part2;

public class Even implements Runnable{
	
	public void run() {
		for(int i = 2; i <= 50; i += 2) {
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
