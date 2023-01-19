


/*
  Create a function which simulates the game "rock, paper, scissors". The function takes the input of both players (rock, paper or scissors), first parameter from first player, second from second player. The function returns the result as such:

  "Player 1 wins"
  "Player 2 wins"
  "TIE" (if both inputs are the same)
  The rules of rock, paper, scissors, if not known:

  Both players have to say either "rock", "paper" or "scissors" at the same time.
  Rock beats scissors, paper beats rock, scissors beat paper.
  Examples
  rps("rock", "paper") ➞ "Player 2 wins"

  rps("paper", "rock") ➞ "Player 1 wins"

  rps("paper", "scissors") ➞ "Player 2 wins"

  rps("scissors", "scissors") ➞ "TIE"

  rps("scissors", "paper") ➞ "Player 1 wins"
  Notes
  There are several ways to solve this challenge.

  19-January-2023
*/

public class Challenge {
  private enum Rps {PAPER, SCISSORS, ROCK}
	
  public static String rps(String s1, String s2) {
    int p1 = Rps.valueOf(s1.toUpperCase()).ordinal();
    int p2 = Rps.valueOf(s2.toUpperCase()).ordinal();
    return (p1 == p2) ? "TIE" 
			: (p1 - p2 == 1 || p1 - p2 == 1 - Rps.values().length) ? "Player 1 wins"
			: "Player 2 wins";
	}
}
