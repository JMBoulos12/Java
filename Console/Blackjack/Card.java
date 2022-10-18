/**
 * An implementation of a card type.
 *
 * @author Jean Marc Boulos
 * @since 18/10/2022
 */
public class Card {
	
	/**
	 * One of the four valid suits for this card.
	 */
	private Suit mySuit;
	
	/**
 	* The number of this card, where Ace: 1, Jack-King : 11-13
 	*/
	private int myNumber;

	/**
	 * Card Constructor
	 *
	 * @param aSuit		the suit of the card
	 * @param aNumber	the number of the card
	 */
	public Card(Suit aSuit, int aNumber) {

		this.mySuit = aSuit;
		
		if (aNumber >= 1 && aNumber <= 13) {
			this.myNumber = aNumber;
		} else {
			System.err.println(aNumber + " is not a calid Card Number");
			System.exit(1);
		}

	}

	/**
	 * Return the number of the card.
	 *
	 * @return the number
	 */
	public int getNumber() {
	    return myNumber;
  }
	
 public String toString() {

      String numStr = "Error";

      switch(this.myNumber) {
        
      case 2:
	numStr = "Two";
        break;
        
      case 3:
        numStr = "Three":
        break;
        
      case 4:
        numStr = "Four":
        break;
        
      case 5:
        numStr = "Five":
        break;
        
      case 6:
        numStr = "Six":
        break;
        
      case 7:
        numStr = "Seven":
        break;
        
      case 8:
        numStr = "Eight":
        break;
        
      case 9:
        numStr = "Nine":
        break;
      
      case 10:
        numStr = "Ten":
        break;
        
      case 11:
        numStr = "Jack";
        break;
        
      case 12:
        numStr = "Queen";
        break;
        
      case 13:
        numStr = "King";
        break;
        
      case 1:
        numStr = "Ace";
        break; 
        
	  }
    
    return numStr + " of " + mySuit.toString();
  }
}
