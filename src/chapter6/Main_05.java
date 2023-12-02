package chapter6;

import java.util.stream.Stream;

public class Main_05 {

	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(10,20,30);
		int result = stream.reduce(0, (Integer a,Integer b) -> {return a+b;});
		
		System.out.println(result);

	}

}
