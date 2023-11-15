package chapter4;

public class Main_01 {

	public static void main(String[] args) {
		int i1 = 100;
		//Boxing
		Integer obj = i1;
		//Unboxing
		int i2 = obj;
		
		method(i2);

	}
	
	//引数でのBoxing
	private static void method(Integer obj) {
		int i = obj + 100;
		System.out.println(i);
		
	}

}
