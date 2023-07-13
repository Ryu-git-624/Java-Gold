package chapter1;

import chapter1.Test05_card.Card;

public class Test05_main {

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
