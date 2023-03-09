



/*
  In this program, three numbers -4.5, 3.9 and 2.5 are stored in variables n1, n2 and n3 respectively.

  Then, to find the largest, the following conditions are checked using if else statements

  * If n1 is greater or equals to both n2 and n3, n1 is the greatest.
  * If n2 is greater or equals to both n1 and n3, n2 is the greatest.
  * Else, n3 is the greatest.
  
  The greatest number can also be found using a nested if..else statement.

  09-March-2023
*/


public class Largest {

    public static void main(String[] args) {

        double n1 = -4.5, n2 = 3.9, n3 = 2.5;

        if( n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is the largest number.");

        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " is the largest number.");

        else
            System.out.println(n3 + " is the largest number.");
    }
}

/*
Output

3.9 is the largest number.
*/
