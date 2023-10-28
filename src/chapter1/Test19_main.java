package chapter1;

interface A{
	void method();
}

interface X extends A{
	@Override
	default void  method() {
		System.out.println("X");
	}
}

interface Y extends A{
	@Override
	default void  method() {
		System.out.println("Y");
	}
}

//method()メソッドの呼び出しが行われた際に、ＸとＹのどちらを呼ぶか判断がつかなくなるためエラー
class Test19_main implements X,Y {

}
