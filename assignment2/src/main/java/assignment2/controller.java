package assignment2;



public class controller {
	
	private static boolean isPrime(int n) { //Used for prompt 9
		if(n < 2) {
			return false;
		}
		for(int i = 2; i <= (n/2); i++) {
			if((n % i) == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		//Prompt 1
		int a=2, b=4, c=5;
		System.out.println("Prompt 1:\n A+B-1+C=" + (a+b-(++c)));
		if((b > a) && (c > b)) {
			System.out.println("C(" + c + ") is greater than A(" + a + ")");
		}
		else {
			System.out.println("C(" + c + ") may or may not be greater than A(" + a + ")");
		}
		int bitwise = (a<<2) | 2;
		System.out.println("A(" + a +") shifted left twice and OR'd with 2 is: " + bitwise);
		
		if(args.length <= 0) { //error if no args were given
			System.out.println("!!!This program requires an integer as a command line argument for prompts 2-4!!!");
		}
		else {
			int[] numArgs = new int[args.length];
			try {
				for(int i = 0; i < args.length; i++) {
					numArgs[i] = Integer.parseInt(args[i]);
				}
				//Prompt 2+3
				if((numArgs[0] % 2) == 0) {
					System.out.println("\nPrompt 2+3:\nThe argument(" + numArgs[0] + ") is even");//Prompt 3
				}
				else {
					System.out.println("\nPrompt 2+3:\nThe argument(" + numArgs[0] + ") is odd");//Prompt 3
				}
				
				//Prompt 4
				System.out.println("\nPrompt 4:");
				int num = numArgs[0];
				//int num = (numArgs[0] % 9) + 1; //convert the argument into a number from 1-10
				switch(num){
				case 1:
					System.out.println("One\n");
					break;
				case 2:
					System.out.println("Two\n");
					break;
				case 3:
					System.out.println("Three\n");
					break;
				case 4:
					System.out.println("Four\n");
					break;
				case 5:
					System.out.println("Five\n");
					break;
				case 6:
					System.out.println("Six\n");
					break;
				case 7:
					System.out.println("Seven\n");
					break;
				case 8:
					System.out.println("Eight\n");
					break;
				case 9:
					System.out.println("Nine\n");
					break;
				case 10:
					System.out.println("Ten\n");
					break;
				default:
					System.out.println("The given argument(" + num + ") is not in the range 1-10\n");
				}
				
			} catch(java.lang.NumberFormatException e) { //if argument given was not a number
				System.out.println("!!!This program requires an integer as a command line argument for prompts 2-4!!!");
			}
			
			//Prompt 5
			System.out.println("Prompt 5:");
			for(int i = 2; i <= 100; i = i + 2) {
				System.out.print(i + ", ");
				if((i % 20) == 0) {//limit 20 numbers per row
					System.out.print("\n");
				}
			}
			
			//Prompt 6
			System.out.println("\nPrompt 6:");
			for(int i = 0; i < 5; i++) {
				for(int j = 1; j <= 5; j++) {
					System.out.print(j + ", ");
				}
				System.out.print("\n");
			}
			
			//Prompt 7
			System.out.println("\nPrompt 7:");
			int number = 1;
			while(number <= 25) {
				System.out.print(number + ", ");
				number++;
			}
			
			//Prompt 8
			System.out.println("\n\nPrompt 8:");
			number = 51;
			do {
				System.out.print(number + ", ");
				number += 2;
			}while(number < 100);
			
			//Prompt 9
			System.out.println("\n\nPrompt 9:");
			for(int i = 1; i<=100;i++) {
				if(isPrime(i)) { //isPrime is defined above
					System.out.print(i + ", ");
				}
			}
			
			//Prompt 10
			System.out.println("\n\nPrompt 10:");
			for(int i = 1; i <= 100; i++) {
				if((i % 2) == 0) {
					continue;
				}
				System.out.print(i + ", ");
			}
			
			//Prompt 11
			System.out.println("\n\nPrompt 11:");
			for(int i = 50; i <= 100; i++) {
				if(i == 75) {
					break;
				}
				else if((i % 2) == 0) {
					System.out.print(i + ", ");
				}
			}
		}
	}

}
