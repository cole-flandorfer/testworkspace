package abstraction;

public class Abstraction {

	public static void main(String[] args) {
		Incrementor inc = new Incrementor();
		
		inc.setAcc(5);
		inc.operate();
		System.out.println("Acc after incrementor operates: " + inc.getAcc());

	}

}
