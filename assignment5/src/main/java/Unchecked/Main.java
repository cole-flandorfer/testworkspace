package Unchecked;

public class Main {

	public static void main(String[] args) {
		int[] arr = {0, 1};
		
		int i = 0;
		
		while(true) {
			try {
				System.out.println(arr[i]);
			} catch(ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
				break;
			}
			i++;
		}
		
		System.out.println("Rest of the program still runs");

	}

}
