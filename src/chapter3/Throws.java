package chapter3;

import java.io.IOException;

public class Throws {
	public static void main(String[] args) {
		try {
			
			//methodA();
			methodB();
			
		}catch(ArrayStoreException | IOException e) {
			System.out.println(e);
		}
	}
	
	static void methodA() throws ArrayStoreException{
		
		throw new ArrayStoreException();
		
	}
	
	//この書き方でもOK
	/*
	static void methodA(){
		throw new ArrayStoreException()
	}
	 */
	
	
	
	static void methodB() throws IOException {
		
		throw new IOException();
		
	}
}
