package ija.ija2016.homework1.cardpack;
import java.util.Arrays;

public class CardStack{
	private int currentSize;
	protected int size;	
	protected Card[] cardArray;
	
	public CardStack(int size){
		this.currentSize=0;
		this.size=size;
		cardArray = new Card[size];
	}
	
	public void put(Card card){
		//this.size++;
		this.cardArray[currentSize]=card;
		this.currentSize++;
	}	
	public void put(CardStack stack){
		Card[] tempArray;
		for(int i =0; i< stack.size; i++){
			this.cardArray[currentSize+i]=stack.cardArray[i];
			currentSize++;
		}
	}	
	public boolean isEmpty(){
		if(this.currentSize <=0){
			return true;
		}else{
			return false;
		}
	}
	public int size(){
		return this.currentSize;
	}
	public CardStack takeFrom(Card card){
		if(this.currentSize == 0){
			return null;
		}
		CardStack tempStack = new CardStack(52);
		int i = 0;
		while(!this.cardArray[i].equals(card)){					
			i++;
		}			
		int j = 0;
		while (this.currentSize > i){		
			tempStack.put(cardArray[i+j]);	
			this.currentSize--;	
			j++;
		}
		return tempStack;
	}
	    
	@Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + this.currentSize;
        hash = 29 * hash + Arrays.deepHashCode(this.cardArray);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CardStack other = (CardStack) obj;
        if (this.currentSize != other.currentSize) {			
            return false;
        }
		int i = 0;	
        while(i<this.currentSize){
			if(!this.cardArray[i].equals(other.cardArray[i])){
				return false;
			}
			i++;
		}
        return true;
    }	
}