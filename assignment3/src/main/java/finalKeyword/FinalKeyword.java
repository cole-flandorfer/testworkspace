package finalKeyword;

final class Alphabet{
	
	final char[] alpha = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	
	final char getLetter(int i) {
		if((i >= 0) && (i <= 25)) {
			return alpha[i];
		}
		else {
			return '!';
		}
	}
}

public class FinalKeyword {
	
	public static void main(String[] args) {
		
		Alphabet a = new Alphabet();
		System.out.println(a.getLetter(5));

	}

}
