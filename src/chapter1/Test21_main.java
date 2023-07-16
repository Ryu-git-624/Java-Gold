package chapter1;

class Myclass21 implements X,Y{

	@Override
	public void method() {
		X.super.method();
	}
	
}

public class Test21_main {

	public static void main(String[] args) {
		Myclass21 obj = new Myclass21();
		obj.method();

	}

}
