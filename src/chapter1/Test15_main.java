package chapter1;

interface Foo15{
	private static void p1() {
		System.out.println("Foo : p1()");
	}
	private void p2() {
		System.out.println("Foo : p2()");
	}
	
	static void methodA() {
		System.out.println("Foo : methodA()");
		p1();
		//p2();
	}
	
	default void methodB() {
		System.out.println("Foo : methodB()");
		p1();
		p2();
	}
	
}

class FooImp1 implements Foo15{
	
}

public class Test15_main implements Foo15{
	public static void main(String[] args) {
		Foo15.methodA();
		new FooImp1().methodB();

	}

}
