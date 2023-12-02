package chapter6;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main_01 {

	public static void main(String[] args) {
		
		//データソースとなるリストの用意
		List<String> list = Arrays.asList("bb","aa","cc");
		
		//各要素を大文字に変換し、リスト内の文字列に置き換え
		for(int i = 0; i < list.size();i++) {
			String str = list.get(i).toUpperCase();
			list.set(i, str);
		}
		
		//昇順にソート
		Collections.sort(list);
		//出力
		for(String str : list) {
			System.out.print(str + " ");
		}
		
		System.out.println();
		
		//リストの用意
		list = Arrays.asList("bb","aa","cc");
		//ストリームAPIで実装した例
		list.stream().sorted().map(s -> s.toUpperCase()).forEach(s -> System.out.print(s + " "));

	}

}

