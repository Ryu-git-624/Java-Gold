package chapter1;

class Test4 {
	static String staticValue = "staticValue";
	String instanceValue = "instanceValue";
	
	
	public class Main{
		public static void main(String[] args) {
			
			Test4 obj = null;
			
			System.out.println(obj.staticValue);
			System.out.println(obj.instanceValue);
		}
		
	}
}

