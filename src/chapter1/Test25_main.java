package chapter1;

//外側のクラス
public class Test25_main {
	
	//インナークラス
	class A{
		void methodA() {
			System.out.println("methodA()");
		}
	}
	
	//staticクラス
	static class B{
		static void methodB() {
			System.out.println("methodB()");
		}
	}
	
	//メソッド内でネストクラスのインスタンス化
	public static void main(String[] args) {
		//非staticクラスのメンバ呼び出し
		new Test25_main().new A().methodA(); 
		//staticクラスのメンバ呼び出し
		new Test25_main.B().methodB();
		Test25_main.B.methodB();

	}

}
