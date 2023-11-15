
 interface A{
	public default void test() {
		System.out.println("A");
	}
}
 
 abstract class B{
	 protected void test() {
		 System.out.println("B");
	 }
 }

public class InterfaceTest extends B implements A {

	public static void main(String[] args) {
		new InterfaceTest().test();

	}

}
