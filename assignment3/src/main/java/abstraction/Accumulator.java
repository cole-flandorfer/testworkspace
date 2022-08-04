package abstraction;

abstract class Accumulator {
	protected int acc;
	
	public Accumulator() {
		acc = 0;
	}
	
	public void setAcc(int i) {
		acc = i;
	}
	
	public int getAcc() {
		return acc;
	}
	
	abstract void operate();
}
