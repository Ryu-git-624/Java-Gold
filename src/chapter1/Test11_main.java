package chapter1;

class Foo11{
	private int num = 2;
	public boolean equals(Object o) {
		//引数で受け取ったオブジェクトがFOOクラスの型を持つオブジェクトかどうかinstanceof演算子で確認
		//オブジェクトが持つ変数の値を比較
		if((o instanceof Foo11) && (((Foo11)o).num == this.num)){
			return true;
		}else {
			return false;
		}
	}
	
	//numに5を抱えて値を返す。hashCodeメソッドの要件は満たしている
	public int hashCode() {
		return num * 5;
	}
}

public class Test11_main {

	public static void main(String[] args) {
		Foo11 f1 = new Foo11();
		Foo11 f2 = new Foo11();
		
		System.out.println("f1.equals(f2) : " + (f1.equals(f2)));
		System.out.println("f1.hashCode() : " + (f1.hashCode()));

	}

}
