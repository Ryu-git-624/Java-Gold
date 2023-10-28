package chapter2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main_07 {
	@SuppressWarnings(value = {"unchecked","deprecation"})
	//@SuppressWarnings({"unchecked","deprecation"})
	public static void main(String[] args) {
		
		//@Deprecatedが付与されたコンストラクタの利用
		Date date = new Date("2023/10/15");
		
		//<>による型が未指定
		List list = new ArrayList();
		
		
	}
}
