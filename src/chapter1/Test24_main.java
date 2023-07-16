package chapter1;

class Outer{
	//インスタンス変数
	private int val1 = 100;
	//static変数
	private static int val2 = 200;
	
	//インナークラス
	class A{
		//非staticメソッド
		void method1() {
			System.out.println("A#method1()#instance val1 : " + val1);
			System.out.println("A#method1()#static val2   : " + val2);
		}
		//staticメソッド
		static void method2() {
			//System.out.println("A#method2()#instance val1 : " + val1);
			System.out.println("A#method2()#static val2   : " + val2);
		}
	}
	
	//staticクラス
	static class B{
		//非staticメソッド
		void method1() {
			//System.out.println("B#method1()#instance val1 : " + val1);
			System.out.println("B#method1()#static val2   : " + val2);
		}
		//staticメソッド
		static void method2() {
			//System.out.println("B#method2()#instance val1 : " + val1);
			System.out.println("B#method2()#static val2   : " + val2);
		}
	}
}

public class Test24_main {

	public static void main(String[] args) {
		//インナークラスのインスタンス化
		Outer.A a = new Outer().new A();
		//staticクラスのインスタンス化
		Outer.B b = new Outer.B();
		
		a.method1();
		b.method2();
	}

}
