package part2;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		ArrayList<Cmparable> able =  new ArrayList<Cmparable>();
		able.add(new Cmparable(7));
		able.add(new Cmparable(12));
		able.add(new Cmparable(34536));
		able.add(new Cmparable(2));
		able.add(new Cmparable(42));
		able.add(new Cmparable(12));
		
		Collections.sort(able);
		for(Cmparable c : able) {
			System.out.println(c.getData());
		}
		System.out.print("\n");
		
		ArrayList<Cmparator> ator =  new ArrayList<Cmparator>();
		ator.add(new Cmparator(7, "One"));
		ator.add(new Cmparator(12, "A"));
		ator.add(new Cmparator(34536, "Sdsncewhjnjaks"));
		ator.add(new Cmparator(2, "Zzzzzzzz"));
		ator.add(new Cmparator(42, "E EEe ee eeeee ee eee e"));
		ator.add(new Cmparator(12, "Dave"));
		
		Collections.sort(ator, new DataComparator());
		for(Cmparator c : ator) {
			System.out.println(c.getData() + ", " + c.getName());
		}
		System.out.print("\n");
		
		Collections.sort(ator, new NameComparator());
		for(Cmparator c : ator) {
			System.out.println(c.getData() + ", " + c.getName());
		}
		System.out.print("\n");

	}

}
