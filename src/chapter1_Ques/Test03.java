package chapter1_Ques;

import chapter1_Ques.Test02.Vals;

public class Test03 {
	enum vals{
		X,
		Y,
		Z
	}
	public static void main(String[] args) {
		Vals data = Vals.Z;
		switch(data) {
		//case 0:
		case X:
			System.out.print("x ");
		//case 1:
		case Y:
			System.out.print("y ");
		//case 2:
		case Z:
			System.out.print("z ");
		default:
			System.out.println("other");
		}
	}
}
