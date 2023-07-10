package chapter1;

class Test2 {
	final int num1 = 10;
	final int num2;
	Test2(int i){
		num2 = i;
	}
}
	
public class Test2_main{
	public static void main(String[] args) {
		final Test2 obj1 = new Test2(100);
		Test2 obj2 = new Test2(300);
		//obj1.num1 = 20;
		//obj1 = new Test2(300); 
			
		System.out.println("obj1.num1 : " + obj1.num1);
		System.out.println("obj2.num2 : " + obj2.num2);
			
	}
	
}


