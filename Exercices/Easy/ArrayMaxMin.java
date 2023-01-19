


/*
  Create a function that takes an array and returns the difference between the biggest and smallest numbers.

  Examples  :
  differenceMaxMin([10, 4, 1, 4, -10, -50, 32, 21]) ➞ 82
  // Smallest number is -50, biggest is 32.

  differenceMaxMin([44, 32, 86, 19]) ➞ 67
  // Smallest number is 19, biggest is 86.
  
  19-January-2023
*/

import java.util.Arrays;
public class Challenge {
  public static int differenceMaxMin(int[] arr) {
    Arrays.sort(arr);
    return arr[arr.length-1]-arr[0];
  }
}
