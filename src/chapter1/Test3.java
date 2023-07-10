package chapter1;

public class Test3 {
	int instanceValue;
	static int staticValue;
	
	//インスタンスメソッド→インスタンス変数へのアクセス
	//OK
	int methodA() {
		return instanceValue;
	}
	
	//インスタンスメソッド→static変数へのアクセス
	//OK
	int methodB() {
		return staticValue;
	}
	
	//staticメソッド→インスタンス変数へのアクセス
	//NG
	/*static int methodC(){
		return instanceValue;
	}*/
	
	//staticメソッド→static変数へのアクセス
	//OK
	static int methodD() {
		return staticValue;
	}
	
	//staticメソッド→自クラスのインスタンス化→インスタンス変数へのアクセス
	//OK
	static int methodE() {
		Test3 obj = new Test3();
		return obj.instanceValue;
	}
}


