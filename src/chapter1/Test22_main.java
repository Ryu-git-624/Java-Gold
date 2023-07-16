package chapter1;

interface A22{
	void method();
}

interface X22 extends A22{
	@Override
	default void method() {
		System.out.println("X22");
	}
}

class Y22 implements A22{

	@Override
	public void method() {
		System.out.println("Y22");
		
	}
	
}

class Myclass22 extends Y22 implements X22{
	
}

public class Test22_main {
	public static void main(String[] args) {
		Myclass22 obj = new Myclass22();
		//常にクラスが優先されるため、Y22クラスのメソッドが呼び出される
		obj.method();
		
	}

}
