


/*
  You are counting points for a basketball game, given the amount of 2-pointers scored and 3-pointers scored, find the final points for the team and return that value.

  Examples  :
  points(13, 12) ➞ 62

  points(17, 12) ➞ 70

  points(38, 8) ➞ 100
  
  19-January-2023
*/

public class BasketballPoints { 
  public static int points(int twos, int threes) {
    return (2*twos+3*threes);
  }
}
