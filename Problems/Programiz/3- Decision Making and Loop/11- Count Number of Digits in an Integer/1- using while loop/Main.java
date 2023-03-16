



/*
  In this program, while the loop is iterated until the test expression num != 0 is evaluated to 0 (false).

  * After the first iteration, num will be divided by 10 and its value will be 345. Then, the count is incremented to 1.
  * After the second iteration, the value of num will be 34 and the count is incremented to 2.
  * After the third iteration, the value of num will be 3 and the count is incremented to 3.
  * After the fourth iteration, the value of num will be 0 and the count is incremented to 4.
  * Then the test expression is evaluated to false and the loop terminates.
  
  Note: The program ignores any zero's present before the number. Hence, for digits like 000333, the output will be 3.
  
  Output:
  Number of digits: 4

  15-March-2023
*/


public class Main {

  public static void main(String[] args) {

    int count = 0, num = 0003452;

    while (num != 0) {
      // num = num/10
      num /= 10;
      ++count;
    }

    System.out.println("Number of digits: " + count);
  }
}
