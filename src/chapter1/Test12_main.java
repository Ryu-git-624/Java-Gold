package chapter1;

interface Test12_main {
	
	//定数を初期化していないためコンパイルエラー
	//int a;
	
	//抽象メソッドはpublicメソッドとなるため不適切なアクセス修飾子は使用できない
	//protected void methodA();
	
	//interfaceを実装したクラス側で抽象メソッドをオーバーライドする必要があるためオーバーライドを禁止するfinal修飾氏は使用できない
	//final void methodB();
	
	//interfaceにはstaticな抽象メソッドは宣言できない
	//static void methodC();
	

}
