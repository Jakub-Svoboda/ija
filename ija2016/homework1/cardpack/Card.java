package ija.ija2016.homework1.cardpack;
import java.util.Objects;

public class Card{
	public enum Color{
		CLUBS, 
		DIAMONDS, 
		HEARTS, 
		SPADES;
		
		
		@Override
		public String toString() {
			switch(this) {
				case CLUBS: return "C";
				case DIAMONDS: return "D";
				case HEARTS: return "H";
				case SPADES: return "S";
				default: throw new IllegalArgumentException();
			}
		}	
	};
	
	
	protected Color color;
	protected int value;	
	
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.color);
        hash = 47 * hash + this.value;
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
        final Card other = (Card) obj;
        if (this.value != other.value) {
            return false;
        }
        if (this.color != other.color) {
            return false;
        }
        return true;
    }
	
	
	public Card(Card.Color c, int value){
		this.color = c;
		this.value = value;
	}
	
	public Card.Color color(){
		return this.color;
	}
		
	public int value(){
		return this.value;
	}	
	
	@Override
	public String toString() {
		String tmpstr = "";
		if(this.value <= 9 ){
			tmpstr=Integer.toString(this.value);
		}else{
			switch(this.value) {
			case 10: 
				tmpstr="T";
				break;
			case 11: 
				tmpstr="J";
				break;
			case 12: 
				tmpstr="Q";
				break;
			case 13: 
				tmpstr="K";
				break;
			}
		}
				
		tmpstr += "(";
		switch(this.color) {
				case CLUBS: 
					tmpstr+= "C";
					break;
				case DIAMONDS: 
					tmpstr+= "D";
					break;
				case HEARTS: 
					tmpstr+= "H";
					break;
				case SPADES: 
					tmpstr+= "S";
					break;
			}
		tmpstr += ")";
		return tmpstr;
		
		
	}
	
}