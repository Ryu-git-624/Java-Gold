package chapter1;

public class Test1 {

	public static void main(String[] args) {
		

	}
}

class SuperA{
	
}

final class SuperB{
	
}

class SuperC{
	void print() {
		
	}
}

class SuperD{
	final void print() {
		
	}
}

class SubA extends SuperA{
	
}

/*class SubB extends SuperB{
	
}*/

class SubC extends SuperC{
	void print() {
		
	}
}

/*class SubD extends SuperD{
	void print() {
		
	}
}*/