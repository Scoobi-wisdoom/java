package collection;

import java.util.HashSet;

public class Col2 {
	
	public static void main(String args[]) {
		HashSet<Integer> set = new HashSet<>();
		set.add(4); set.add(3); set.add(4);
		set.add(2); set.add(1); set.add(3);
		
		System.out.println(set.size());
		
		for(Integer i: set) {
			System.out.println(i);
		}
	}

}
