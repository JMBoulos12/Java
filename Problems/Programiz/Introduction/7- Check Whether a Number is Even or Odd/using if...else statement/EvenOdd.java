



/*
  In this program, a Scanner object, reader is created to read a number from the user's keyboard. The entered number is then stored in a variable num.

  Now, to check whether num is even or odd, we calculate its remainder using % operator and check if it is divisible by 2 or not.

  For this, we use if...else statement in Java. If num is divisible by 2, we print num is even. Else, we print num is odd.

  We can also check if num is even or odd by using ternary operator in Java.

  09-March-2023
*/


import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }
}

/*
Enter a number: 12
12 is even
*/
