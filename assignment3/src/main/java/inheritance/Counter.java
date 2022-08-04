package inheritance;

public class Counter extends Incrementor{
	Counter(){
		total = 0;
	}
	
	public void decrement() {
		total--;
	}
}
