package chapter4;

import java.util.TreeSet;

public class CeilingQues {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();
		set.add("Naoki");
		set.add("nana");
		set.add("NARUMI");
		System.out.println(set);
		System.out.println(set.ceiling("Na"));

	}

}
