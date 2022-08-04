package part2;

public class Cmparable implements Comparable<Cmparable>{
	private int data;
	
	public Cmparable() {
		data = 0;
	}
	
	public Cmparable(int data) {
		this.data = data;
	}
	
	public int getData() {
		return data;
	}
	
	public int compareTo(Cmparable c) {
		if(data == c.getData()) {
			return 0;
		}
		else if(data > c.getData()) {
			return 1;
		}
		else {
			return -1;
		}
	}
}
