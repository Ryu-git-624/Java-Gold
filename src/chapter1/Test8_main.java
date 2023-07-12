package chapter1;

class Foo{
	
}

class Bar{
	public String toString() {
		return "This is an object made from Bar.";
	}
}

public class Test8_main {

	public static void main(String[] args) {
		int[] ary = {1,2};
		String obj1 = "Tanaka";
		Foo obj2 = new Foo();
		Bar obj3 = new Bar();
		
		System.out.println(ary);
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		
	}

}
