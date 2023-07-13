package chapter1;

public class Test10_main {

	public static void main(String[] args) {
		Foo f1 = new Foo();
		Foo f2 = new Foo();
		
		System.out.println("f1 : " + f1.hashCode());
		System.out.println("f2 : " + f2.hashCode()); 
		
		Foo f3 = new Foo();
		Foo f4 = f3;
		
		System.out.println("f3 : " + f3.hashCode());
		System.out.println("f4 : " + f4.hashCode());
		
	}

}
