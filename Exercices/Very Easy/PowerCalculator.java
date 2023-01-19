


/*
  Create a function that takes voltage and current and returns the calculated power.

  Examples  :
  power(230, 10) ➞ 2300

  power(110, 3) ➞ 330

  power(480, 20) ➞ 9600
  
  19-January-2023
*/

public class Circuit {
  public static int power(int... k) {
    return k[0] * k[1];
  }
}
