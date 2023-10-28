package chapter1;

interface MyInter{
	void methodA();
}

class Outer29{
	void method1() {
		new MyInter(){
			public void methodA() {
				System.out.println("method1#methodA()");
			}
		}.methodA(); //匿名クラスの呼び出し
	}
	
	void method2() {
		MyInter obj = new MyInter() {
			public void methodA() {
				System.out.println("method2#methodA()");
			}
		};
		obj.methodA();//匿名クラスの呼び出し
	}
}

public class Test29_main {

	public static void main(String[] args) {
		new Outer29().method1();
		new Outer29().method2();

	}

}
