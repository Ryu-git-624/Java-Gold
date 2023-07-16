package chapter1;

class Outer26{
	private int num = 100;
	class A{
		public int num = 200;
		void method(int num) {
			num += 1;
			this.num += 1;
			Outer26.this.num += 1;
			System.out.println("num : " + num);
			System.out.println("this.num : " + this.num);
			System.out.println("Outer27.this.num : " + Outer26.this.num);
		}
	}
}

public class Test26_main {

	public static void main(String[] args) {
		new Outer26().new A().method(300);

	}

}
