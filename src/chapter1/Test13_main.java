package chapter1;

interface Foo13{
	//暗黙敵にpublicが付与される
	static void method() {
		System.out.println("Foo : method()");
	}
}

public class Test13_main {

	public static void main(String[] args) {
		Foo13.method();
		
		//interfaceはインスタンス化できないためコンパイルエラー
		//Foo13 obj = new Foo13();

	}

}
