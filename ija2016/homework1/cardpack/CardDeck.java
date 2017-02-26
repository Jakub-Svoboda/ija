public class CardDeck{
	protected int size;	
	protected Card[] cardArray;
	
	CardDeck(int size){
		this.size=size;
	}
	public static CardDeck createStandardDeck(){
		CardDeck deck = new CardDeck(52);
		for(int i = 0; i<13; i++){		
			deck.cardArray[i] = new Card(Card.Color.CLUBS,i);
		}
		for(int i = 0; i<13; i++){		
			deck.cardArray[i+13] = new Card(Card.Color.DIAMONDS,i);
		}
		for(int i = 0; i<13; i++){		
			deck.cardArray[i+26] = new Card(Card.Color.HEARTS,i);
		}
		for(int i = 0; i<13; i++){		
			deck.cardArray[i+39] = new Card(Card.Color.SPADES,i);
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
		return cardArray[size+1];
	}
	
}