package chapter5;

import java.util.function.Predicate;

public class LambdaQues01 {
	
	int val;

	public static void main(String[] args) {
		LambdaQues01 obj = new LambdaQues01();
		obj.val = 20;
		method(obj,(LambdaQues01 a) -> {return a.val < 21;});

	}

	private static void method(LambdaQues01 obj, Predicate<LambdaQues01> p) {
		String ans = p.test(obj) ? "Hello":"Bye";
		System.out.println(ans);
		
	}

}
