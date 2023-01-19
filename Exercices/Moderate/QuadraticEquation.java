


/*
  Create a function to find only the root value of x in any quadratic equation ax^2 + bx + c. The function will take three arguments:

  a as the coefficient of x^2
  b as the coefficient of x
  c as the constant term
  Examples
  quadraticEquation(1, 2, -3) ➞ 1

  quadraticEquation(2, -7, 3) ➞ 3

  quadraticEquation(1, -12, -28) ➞ 14 
  
  19-January-2023
*/

public class Challenge {
  public static int quadraticEquation(int a, int b, int c) {
    return (int) (((-b)+Math.sqrt((b*b - 4 * a * c)))/(2*a));
  }
}
