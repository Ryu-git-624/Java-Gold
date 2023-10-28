package chapter3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MultiCatch {
	
	public static void main(String[] args) {
		try {
				int a = 10/0;
				FileReader rf = new FileReader("a.txt");
				rf.read();
		} catch (ArithmeticException | FileNotFoundException e) {
			e = null;
		}catch(IOException e) {
			e = null;
		}
	}
}
	