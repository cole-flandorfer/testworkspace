package Custom;

public class Main {

	public static void foo(int i) throws CustomException {
		if(i != 0) {
			throw new CustomException("!!! You've triggered my CustomException !!!");
		}
	}
	
	public static void main(String[] args) {
		try {
			foo(7);
		} catch(CustomException e) {
			System.out.println("Caught a CustomException!\nMessage is as follows:");
			System.out.println(e.getMessage());
		}

	}

}
