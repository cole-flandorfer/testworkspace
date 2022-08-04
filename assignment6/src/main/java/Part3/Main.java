package Part3;

public class Main {
	
	public static void main(String[] args) {
		//first, without using sync insert method
		Collector data =  new Collector();
		Thread one = new Thread(new Inserter(data, 1, false), "one");
		Thread two = new Thread(new Inserter(data, 2, false), "two");
		
		one.start();
		two.start();
		try {
			Thread.sleep(600);
		} catch (InterruptedException e) {
			e.printStackTrace();
			Thread.currentThread().interrupt();
		}
		data.printData(); 
		//You may see 0s in the collector, which means that the threads overwrote eachother's inputs at times, and the index after was skipped
		
		//now with the sync insert method
		Collector dataB =  new Collector();
		Thread three = new Thread(new Inserter(dataB, 3, true), "three");
		Thread four = new Thread(new Inserter(dataB, 4, true), "four");
		
		three.start();
		four.start();
		try {
			Thread.sleep(600);
		} catch (InterruptedException e) {
			e.printStackTrace();
			Thread.currentThread().interrupt();
		}
		dataB.printData(); //there are no zeroes, as only 1 method can print at a time, the conflict between the threads is resolved
	}
	
	
	
	
	
	
	
}
