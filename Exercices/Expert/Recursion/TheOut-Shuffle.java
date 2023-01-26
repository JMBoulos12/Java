




/*
  An out-shuffle, also known as an out faro shuffle or a perfect shuffle, is a controlled method for shuffling playing cards. It is performed by splitting the deck into two equal halves and interleaving them together perfectly, with the condition that the top card of the deck remains in place. Using an array to represent a deck of cards, an out-shuffle looks like:

  [1, 2, 3, 4, 5, 6, 7, 8] ➞ [1, 5, 2, 6, 3, 7, 4, 8]
  // Card 1 remains in the first position.
  
  If we repeat the process, the deck eventually returns to original order: Shuffle 1:
  [1, 2, 3, 4, 5, 6, 7, 8] ➞ [1, 5, 2, 6, 3, 7, 4, 8]
  
  Shuffle 2:
  [1, 5, 2, 6, 3, 7, 4, 8] ➞ [1, 3, 5, 7, 2, 4, 6, 8]
  
  Shuffle 3:
  [1, 3, 5, 7, 2, 4, 6, 8] ➞ [1, 2, 3, 4, 5, 6, 7, 8]
  // Back where we started.
  
  Write a function that takes a positive even integer representing the number of the cards in a deck, 
  and returns the number of out-shuffles required to return the deck to its original order.

  Examples  :
  shuffleCount(8) ➞ 3

  shuffleCount(14) ➞ 12

  shuffleCount(52) ➞ 8
  
  Notes :
  * The number of cards is always even and greater than one. Thus, the smallest possible deck size is two.
  * You are expected to solve this challenge via a recursive approach. 

  26-January-2023
*/

public class OutShuffle {
  public static int shuffleCount(int num) {
    int[] deck = new int[num];
    for(int i = 0; i < num; i++){
      deck[i] = i+1;
    }
    return outShuffle(deck,deck);
  }
  
  public static int outShuffle(int[] deck, int[] check){
    int[] newdeck = new int[deck.length];
    for(int i = 0; i < deck.length; i++){
      if(i%2 == 0){
        newdeck[i] = deck[i/2];
      }else{
        newdeck[i] = deck[deck.length/2 + i/2];
      }
    }
    if(eq(newdeck,check)){
      return 1;
    }else{
      return 1 + outShuffle(newdeck, check); 
    }
  }
  
  public static boolean eq(int[] arg1, int[] arg2){
    if(arg1.length != arg2.length){
      return false;
    }else{
      for(int i = 0; i < arg1.length; i++){
        if(arg1[i] != arg2[i]){
          return false;
        }
      }
      return true;
    }
  }
}
