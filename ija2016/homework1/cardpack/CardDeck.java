package ija.ija2016.homework1.cardpack;

public class CardDeck{
	protected int size;	
	protected Card[] cardArray;
	
	public CardDeck(int size){
		this.size=size;
		cardArray = new Card[size];
	}
	public static CardDeck createStandardDeck(){
		CardDeck deck = new CardDeck(52);
		for(int i = 1; i<=13; i++){			
			deck.cardArray[i-1] = new Card(Card.Color.CLUBS,i);
		}
		for(int i = 1; i<=13; i++){		
			deck.cardArray[i+12] = new Card(Card.Color.DIAMONDS,i);
		}
		for(int i = 1; i<=13; i++){		
			deck.cardArray[i+25] = new Card(Card.Color.HEARTS,i);
		}
		for(int i = 1; i<=13; i++){		
			deck.cardArray[i+38] = new Card(Card.Color.SPADES,i);
		}
		return deck;
	}
	public int size(){
		return this.size;
	}
	public void put(Card card){		
		this.size++;
		cardArray[size]=card;
	}
	public Card pop(){
		this.size--;
		return cardArray[size];
	}
	

	
	
	
}