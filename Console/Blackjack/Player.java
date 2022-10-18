/**
 * An implementation of a blackjack player.
 *
 * @author Jean Marc Boulos
 * @since 18/10/2022
 *
 */
public class Player {
  
  /**
   * The player's name.
   */
  private String name;
  
  /**
   * The cars in the player's current hand.
   */
  private Card[] hand = new Card[10];
  
  /**
   * The number of cards in the player's current hand.
   */
  private int numCards;
  
  /**
   * Player constructor.
   *
   * @param aName the name of the player
   */ 
  public Player(String aName) {
    
    this.name = aName;
    
    // set a player's hand to empty
    this.emptyHand();
  }
  
  /**
   * Reset the player's hand to have no cards.
   */
  public void emptyHand() {
    
    for (int c = 0; c < 10; c++) {
      this.hand[c] = null;
    }
    this.numCards = 0;

  }
 
  /**
   * add a card to the player's hand
   
   * @param aCard the card to add
   * @return      whether the sum of the new hand is below to equal to 21      
   */
  public boolean addCard(Card aCard) {
    
    // print error if we already have the max number of cards
    if (this.numCard == 10) {
      System.err.printf("%s's hand already has 10 cards; " +
                        "cannot add another\n", this.name);
      System.exit(1);
    }
    
    // add new card in next slot and increment number of cards counter
    this.hand[this.numCards] = aCard;
    this.numCards++;
    
    return (this.getHandSum() <= 21);
  }
  
  /**
   * Get the sum of the cards in the player's hand
   *
   * @return the sum
   */
  public int getHandSum() {
    
    
    
  }
}
