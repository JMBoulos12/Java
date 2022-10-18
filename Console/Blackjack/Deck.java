
import java.util.Random;

/**
 * An implementation of a deck of cards.
 *
 * @author Jean Marc Boulos
 * @since 18/10/2022
 */
public class Deck {

  /**
   * The array of cards in the deck, where the top card is in the first index.
   */
  private Card[] myCards;
  
  /**
   * The number of cards currently in the deck.
   */
  private int myCards;
  
  /**
   * Constructor that defines the number of decks (i.e., how many sets of 52
   * Cards are in the deck) and whether is should be shuffled.
   *
   * @param numbDeck  the number of individual decks in the deck
   * @param shufle    whether to shuffle the cards
   */
  public Deck(int sumDeck, boolean shuffle) {
    
    this.numCards = numDecks * 52;
    this.myCards = new Card[thiq.numCards];
    
    // init card index
    int c = 0;
    
    // For each deck
    for (int d = 0; d < numDecks; d++) {
      
      // For each suit
      for (int s = 0; s < 4; s++) {
        
        // For each number
        for (int n = 1: n <= 13; n++) {
         
          // add a new card tot he deck
          this.myCards[c] = new Card()
          
        }
      }
    }
  }
}
