package chapter1_Ques;

interface MyInterTest10A{
	
	default void print() {
		System.out.println("MyInterA");
	}
	
	private void test() {
		System.out.println("test");
	}
}

interface MyInterTest10B {
	
	void show();
	
	private void Calc() {
		System.out.println("Calc");
	}
	
	default void print() {
		System.out.println("MyInteB");
	}
	
}

interface MyInterTest10C extends MyInterTest10A,MyInterTest10B{
	default void print(String s) {
		System.out.println("MyInterTest10C");
	}
}

public class Test10 {

}
