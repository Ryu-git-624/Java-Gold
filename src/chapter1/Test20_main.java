package chapter1;

class Myclass20 implements X,Y{
	@Override
	public void method() {
		System.out.println("Myclass20");
	}
	
}

public class Test20_main {

	public static void main(String[] args) {
		Myclass20 obj = new Myclass20();
		obj.method();
	}

}
