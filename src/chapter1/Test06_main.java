package chapter1;

enum Card{
	SPADES(3),
	CUBS(1),
	DIAMONDS(4),
	HEARTS();//HEARTSでも文法上許可される
	
	private int a;
	
	//コンストラクタ
	Card(){
		this.a = 100;
	}

	//コンストラクタ
	Card(int a){
		this.a = a;
	}
	
	public int getA() {
		return a;
	}
}

public class Test06_main {
	public static void main(String[] args) {
		Card card = Card.DIAMONDS;
		System.out.println(card);
		System.out.println(card.getA());
		//ordinal 列挙宣言時での位置
		System.out.println(card.ordinal());
		System.out.println(Card.HEARTS.getA());
		for(Card obj : Card.values()) {
			System.out.print(obj  + " ");
		}
	}
}
