public class Card{
	public enum Color{CLUBS, DIAMONDS, HEARTS, SPADES};
	
	protected Color color;
	protected int value;	
	
	Card(Card.Color c, int value){
		this.color = c;
		this.value = value;
	}
	
	public Card.Color color(){
		return this.color;
	}
		
	public int value(){
		return this.value;
	}	
	
}