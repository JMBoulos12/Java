


/*
  Create a function that takes an integer and outputs an n x n square solely consisting of the integer n.

  Examples
  squarePatch(3) ➞ [
    [3, 3, 3],
    [3, 3, 3],
    [3, 3, 3]
  ]

  squarePatch(5) ➞ [
    [5, 5, 5, 5, 5],
    [5, 5, 5, 5, 5],
    [5, 5, 5, 5, 5],
    [5, 5, 5, 5, 5],
    [5, 5, 5, 5, 5]
  ]

  squarePatch(1) ➞ [
    [1]
  ]

  squarePatch(0) ➞ []
  Notes
  n >= 0.
  If n = 0, return an empty array.

  19-January-2023
*/

public class Challenge {
  public static int[][] squarePatch(int n) {
    int[][] finalArray = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        finalArray[i][j] = n;
      }
    }
    return finalArray;
  }
}
