package chapter2;

class Parent02{
	void bar() {
		System.out.println("Parent02#bar");
	}
}

class Child02 extends Parent02{
	@Override //アノテーション
	//スーパークラスのメソッドをオーバーライドしているという意味付けが行われ、タイプミスが防げる
	void bal() {
		System.out.println("Chiold02#method()");
	}
	
	void bar() {
		System.out.println("Chiold02#method()");
	}
}

public class Test02_main {

	public static void main(String[] args) {
		new Child02().bar();

	}

}
