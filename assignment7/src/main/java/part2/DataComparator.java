package part2;

import java.util.Comparator;

public class DataComparator implements Comparator<Cmparator>{
	public int compare(Cmparator c1, Cmparator c2) {
		if(c1.getData() == c2.getData()) {
			return 0;
		}
		else if(c1.getData() > c2.getData()) {
			return 1;
		}
		else {
			return -1;
		}
	}
}
