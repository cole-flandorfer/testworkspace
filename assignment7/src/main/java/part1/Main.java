package part1;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> alist = new ArrayList<Integer>();
		alist.add(7);
		alist.add(12);
		alist.add(3);
		alist.remove(1);
		for(Integer value : alist) {
			System.out.println(value);
		}
		System.out.print("\n");
		
		LinkedList<String> lList = new LinkedList<String>();
		lList.add("John");
		lList.add("Bee");
		lList.add("Pie");
		lList.add("Snow");
		lList.remove(0);
		for(String word : lList) {
			System.out.println(word);
		}
		System.out.print("\n");
		
		Vector<Boolean> vBool = new Vector<Boolean>();
		vBool.add(true);
		vBool.add(false);
		vBool.add(false);
		vBool.add(true);
		vBool.remove(2);
		for(Boolean bool : vBool) {
			System.out.println(bool);
		}
		System.out.print("\n");
		
		Stack<Character> cStack = new Stack<Character>();
		cStack.push('c');
		cStack.push('w');
		cStack.push('b');
		cStack.push('q');
		cStack.push('s');
		cStack.push('b');
		System.out.println("Popped: " + cStack.pop());
		for(Character c : cStack) {
			System.out.println(c);
		}
		System.out.print("\n");
		
		HashSet<String> hSet = new HashSet<String>();
		hSet.add("password123");
		hSet.add("password1");
		hSet.add("hunter2");
		hSet.add("adminpassword");
		hSet.remove("hunter2");
		for(String pWord : hSet) {
			System.out.println(pWord);
		}
		System.out.print("\n");
		
		LinkedHashSet<String> lhSet = new LinkedHashSet<String>();
		lhSet.add("password123");
		lhSet.add("password1");
		lhSet.add("hunter2");
		lhSet.add("adminpassword");
		lhSet.remove("hunter2");
		for(String pWord : lhSet) {
			System.out.println(pWord);
		}
		System.out.print("\n");
		
		TreeSet<String> tSet = new TreeSet<String>();
		tSet.add("password123");
		tSet.add("password1");
		tSet.add("hunter2");
		tSet.add("adminpassword");
		tSet.remove("hunter2");
		for(String pWord : tSet) {
			System.out.println(pWord);
		}
		System.out.print("\n");
		
		HashMap<Integer, String> hMap = new HashMap<Integer, String>();
		hMap.put(0, "Joe");
		hMap.put(234, "dfsdckwuehxbahg");
		hMap.put(1, "Anna");
		hMap.put(7, "Bob");
		hMap.put(4000, "Dave");
		hMap.remove(0);
		for(Map.Entry<Integer, String> entry : hMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		System.out.print("\n");
		
		LinkedHashMap<Integer, String> lhMap = new LinkedHashMap<Integer, String>();
		lhMap.put(0, "Joe");
		lhMap.put(234, "dfsdckwuehxbahg");
		lhMap.put(1, "Anna");
		lhMap.put(7, "Bob");
		lhMap.put(4000, "Dave");
		lhMap.remove(0);
		for(Map.Entry<Integer, String> entry : lhMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		System.out.print("\n");
		
		TreeMap<Integer, String> tMap = new TreeMap<Integer, String>();
		tMap.put(0, "Joe");
		tMap.put(234, "dfsdckwuehxbahg");
		tMap.put(1, "Anna");
		tMap.put(7, "Bob");
		tMap.put(4000, "Dave");
		tMap.remove(0);
		for(Map.Entry<Integer, String> entry : tMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

	}

}
