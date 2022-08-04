package Part3;

public class Collector { //collects 10 ints in an array
	private int index;
	private int[] arr;
	
	public Collector() {
		index = 0;
		arr = new int[10];
	}
	
	public void printData() {
		for(int i = 0; i < 10; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.print("\n");
	}
	
	public synchronized void insertSync(int i) {
		if(index < 10) {
			arr[index] = i;
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
				Thread.currentThread().interrupt();
			}
			index++;
		}
		else {
			System.out.println("!!!Tried to insert " + i + " but collector was full!!!");
		}
	}
	
	public void insert(int i) {
		if(index < 10) {
			arr[index] = i;
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
				Thread.currentThread().interrupt();
			}
			index++;
		}
		else {
			System.out.println("!!!Tried to insert " + i + " but collector was full!!!");
		}
	}
	
	
}
