


/*
  Create a function that takes three integer arguments (a, b, c) and returns the amount of integers which are of equal value.

  Examples
  equal(3, 4, 3) ➞ 2

  equal(1, 1, 1) ➞ 3

  equal(3, 4, 1) ➞ 0
  Notes
  Your function must return 0, 2 or 3. 
  
  19-January-2023
*/

public class Challenge {
  public static int equal(int a, int b, int c) {
		
    if (a == b && b == c) {
      return 3;
    }
    if (a ==b || a == c || b == c){
      return 2;
    }
    return 0;
  }
}
