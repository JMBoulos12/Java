



/*
  In this program, we've replaced if...else statement with ternary operator (? :).

  Here, if num is divisible by 2,"even" is returned. Else, "odd" is returned. The returned value is saved in a string variable evenOdd.

  Then, the result is printed on the screen using string concatenation.

  09-March-2023
*/


import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        String evenOdd = (num % 2 == 0) ? "even" : "odd";

        System.out.println(num + " is " + evenOdd);
    }
}
/*
  Output  :
Enter a number: 13
13 is odd
*/
