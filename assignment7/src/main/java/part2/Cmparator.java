package part2;

public class Cmparator {
	private int data;
	private String name;
	
	public Cmparator() {
		data = 0;
		name= "";
	}
	
	public Cmparator(int data, String name) {
		this.data = data;
		this.name = name;
	}
	
	public int getData() {
		return data;
	}
	
	public String getName() {
		return name;
	}
}
