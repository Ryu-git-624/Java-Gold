package chapter2;

@FunctionalInterface
interface Test03<T> {
	
	//抽象メソッド
	void foo(T t);
	
	//Objectクラスのpublicメソッド
	String toString();
	
	//Objectクラスのpublicメソッド
	boolean equals(Object obj);
	
	//staticメソッド
	static void x() {
		
	}
	
	//defaultメソッド
	default void y() {
		
	}
}
