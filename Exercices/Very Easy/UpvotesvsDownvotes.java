


/*
  Given an object containing counts of both upvotes and downvotes, return what vote count should be displayed. This is calculated by subtracting the number of downvotes from upvotes.

  Examples
  getVoteCount({ upvotes: 13, downvotes: 0 }) ➞ 13

  getVoteCount({ upvotes: 2, downvotes: 33 }) ➞ -31

  getVoteCount({ upvotes: 132, downvotes: 132 }) ➞ 0
  Notes
  You can expect only positive integers for vote counts.

  19-January-2023
*/

public class Solution {
  public static int getVoteCount(int upvotes,int downvotes) {
    return upvotes-downvotes;
  }
}
