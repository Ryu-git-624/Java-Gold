package chapter1_Ques;

public class Test11 {
	
	int num = 10;
	
	class Foo{
		static int num = 50;
		void show() {
			System.out.println(num);
		}
	}

	public static void main(String[] args) {
		Test11 obj = new Test11();
		Test11.Foo foo = obj.new Foo();
		foo.show();

	}

}
