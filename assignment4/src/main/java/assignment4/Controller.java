package assignment4;

public class Controller {

	//for 7
	public static void reference(int[] arr) {
		arr[0] = 2000; //changes original array because it is passed by reference
	}
	public static void value(int i) {
		i = 2000; //does nothing, just demonstrates original value isn't changed as it is passed by value
	}
	
	public static void main(String[] args) {
		//1
		String one = "test";
		System.out.println(one + one.length() + one.charAt(one.length()/2) + one.indexOf("e"));
		
		//2
		StringBuffer two = new StringBuffer("test");
		two.append(" and some more chars");
		System.out.println(two);
		two.insert(4, one);
		System.out.println(two);
		
		//3
		StringBuilder three = new StringBuilder("test");
		three.append(" and some more chars");
		System.out.println(three);
		three.insert(4, one);
		System.out.println(three);
		
		//4
		int[] four = {4,2,7,24,3,73,21,83,56,9};
		int oddSum = 0, evenSum = 0;
		
		for(int i = 0; i < four.length; i++) {
			if((four[i] % 2) == 0) {
				evenSum += four[i];
			}
			else {
				oddSum += four[i];
			}
		}
		System.out.println("Even: " + evenSum + "\nOdd: " + oddSum);
		
		//5
		String[] five = {"one", "two", "three", "four"};
		
		for(String number : five) {
			System.out.println(number);
		}
		
		//6
		System.out.print("\n");
		int[][] six = {{1,2,3},{4,5,6},{7,8,9}};
		for(int i = 0; i < six.length; i++) {
			for(int j = 0; j < six[i].length; j++) {
				System.out.print(six[i][j] + ", ");
			}
			System.out.print("\n");
		}
		
		//7 see functions above main
		int[] a = {0, 1, 2};
		System.out.println(a[0] + " " + a[1] + " " + a[2]);
		reference(a);
		System.out.println(a[0] + " " + a[1] + " " + a[2]);
		
		int seven = 0;
		System.out.println(seven);
		value(seven);
		System.out.println(seven);

	}

}
