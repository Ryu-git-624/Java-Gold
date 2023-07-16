package chapter1;

interface MyInter18{
	default void method() {
		System.out.println("MyInter18");
	}
}

class Test18_main implements MyInter18{
	//デフォルトメソッドは実装クラスでオーバーライド可能
	@Override
	public void method() {
		System.out.println("Test18_main");
	}
	
}
