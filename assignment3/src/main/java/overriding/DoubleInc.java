package overriding;

public class DoubleInc extends Incrementor{
	
	@Override
	public void increment() {
		total+=2;
	}
	
}
