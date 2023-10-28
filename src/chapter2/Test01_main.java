package chapter2;

class Parent{
	
	void bar() {
		System.out.println("Parent#bar()");
	}
}

class Child extends Parent{
	//bar()メソッドをオーバーライドする予定だった
	void bal() {
		System.out.println("Child#bar()");
	}
}

public class Test01_main {
	public static void main(String[] args) {
		new Child().bar();
	}

}
