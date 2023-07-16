package chapter1;

class Test27_main {
	abstract class A{
		abstract void foo();
	}
	
	class B extends A{
		void foo() {
			
		}
	}
	
	static interface X{
		void bar();
	}
	
	static class Y implements X{
		public void bar() {
			
		}
	}
}
