public class CardStack{
	protected int size;	
	protected Card[] cardArray;
	
	CardStack(int size){
		this.size=size;
	}
	
	public void put(Card card){
		this.size++;
		this.cardArray[size]=card;
	}	
	public void put(CardStack stack){
		Card[] tempArray;
		for(int i =0; i< stack.size; i++){
			this.cardArray[size+1+i]=stack.cardArray[i];
			size++;
		}
	}	
	public boolean isEmpty(){
		if(this.size <=0){
			return true;
		}else{
			return false;
		}
	}
	public int size(){
		return this.size;
	}
	public CardStack takeFrom(Card card){
		if(this.size == 0){
			return null;
		}
		CardStack tempStack = new CardStack(0);
		while(this.cardArray[size] != card){
			tempStack.put(this.cardArray[size]);		//insert the card into temporary stack
			this.size--;								//pop the card			
		}
		tempStack.put(this.cardArray[size]);		//insert the card into temporary stack
		this.size--;								//pop the card		
		return tempStack;
	}
}