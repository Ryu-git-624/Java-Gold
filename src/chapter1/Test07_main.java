package chapter1;

enum Vals{
	//A,B; コンパイルエラー
	
	//抽象メソッドをオーバーライド
	A{
		void foo(){
			System.out.println("A");
		}
	},
	B{
		void foo(){
			System.out.println("B");
		}
	};
	//抽象メソッド
	abstract void foo();
}

public class Test07_main {

	public static void main(String[] args) {
		Vals val = Vals.B;
		val.foo();

	}

}
