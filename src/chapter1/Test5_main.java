package chapter1;

import chapter1.Test5_card.Card;

public class Test5_main {

	public static void main(String[] args) {
		Card card = Card.DIAMONDS;
		
		switch(card) {
			case SPADES:
			case CLUBS:
			System.out.println("Gold");
			break;
			
			case DIAMONDS:
			case HEARTS:
			System.out.println("Platinum");
			break;
			
		}

	}

}
