


/*
  Create a method that takes an array of 10 integers (between 0 and 9) and returns a string of those numbers formatted as a phone number (e.g. (555) 555-5555).

  Examples  :
  formatPhoneNumber([1, 2, 3, 4, 5, 6, 7, 8, 9, 0]) ➞ "(123) 456-7890"

  formatPhoneNumber([5, 1, 9, 5, 5, 5, 4, 4, 6, 8]) ➞ "(519) 555-4468"

  formatPhoneNumber([3, 4, 5, 5, 0, 1, 2, 5, 2, 7]) ➞ "(345) 501-2527"
  
  Notes :
  Don't forget the space after the closing parenthesis.
  
  19-January-2023
*/

public class Program {
  public static String formatPhoneNumber(int[] nums) {
    return String.format("(%d%d%d) %d%d%d-%d%d%d%d", nums[0], nums[1], nums[2], nums[3],
													nums[4], nums[5], nums[6], nums[7], nums[8], nums[9]);
  }
}
