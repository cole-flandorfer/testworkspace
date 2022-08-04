package Part3;

public class Inserter implements Runnable {
	
	private Collector out;
	private int tag;
	private boolean sync;
	
	public Inserter() {
		
	}
	
	public Inserter(Collector c, int i, boolean s) {
		out = c;
		tag = i;
		sync = s;
	}
	
	@Override
	public void run() { //insert 5 values into the collector
		for(int i = 0; i < 5; i++) {
			
			if(sync) {
				out.insertSync(tag);
			}
			else{
				out.insert(tag);
			}

			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
				Thread.currentThread().interrupt();
			}
		}

	}

}
