package chapter1;

class Outer28{
	
	private static int a = 1;
	private int b = 2;
	
	void methodOuter(final int c,int d) {
		
		final int e = 5;
		int f = 6;
		
		class A{
			void method() {
				System.out.print(a + " ");
				System.out.print(b + " ");
				System.out.print(c + " ");
				System.out.print(d + " ");
				System.out.print(e + " ");
				System.out.print(f);
				//ローカル変数には暗黙的にfinal修飾子が付与されるため代入不可
				//d = 100;
				//f = 100;
			}
		}
		
		new A().method();
	}
}

public class Test28_main {
	public static void main(String[] args) {
		Outer28 o = new Outer28();
		o.methodOuter(3, 4);
	}

}
