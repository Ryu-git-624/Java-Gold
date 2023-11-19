package chapter5;

import java.util.Arrays;
import java.util.List;

public class Lambda01 {

	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("Tanaka","Sato");
		
		//匿名クラスで実装
		/*words.replaceAll(new UnaryOperator<String>(){
			public String apply(String str) {
				return str.toUpperCase();
			}
		});*/
		
		//ラムダ式で実装
		words.replaceAll((String str) -> {return str.toUpperCase();});
		//ラムダ式(右辺簡略)
		words.replaceAll(str -> {return str.toUpperCase();});
		//ラムダ式(左辺簡略)
		words.replaceAll((String str) -> str.toUpperCase());
		//ラムダ式(両辺簡略)
		words.replaceAll(str -> str.toUpperCase());
		
		System.out.println(words);

	}

}
