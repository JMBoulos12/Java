


/*
  Some basic arithmetic operators are +, -, *, /, and %. In this challenge you will be given three parameters, num1, num2, and an operator. Use the operator on parameters num1 and num2.

  Examples
  operate(1, 2, "+") ➞ 3
  // 1 + 2 = 3

  operate(7, 10, "-") ➞ -3
  // 7 - 10 = -3

  operate(20, 10, "%") ➞ 0
  // 20 % 10 = 0
  
  Notes :
  There will be no division by zero.
  
  19-January-2023
*/

public class ArithmeticOps {
  public static int operate(int a, int b, String op) {
    switch (op) {
      case "+":
        return a + b;
      case "-":
        return a - b;
      case "*":
        return a * b;
      case "/":
        return a / b;
      default:
        return a % b;
    }
  }
}
