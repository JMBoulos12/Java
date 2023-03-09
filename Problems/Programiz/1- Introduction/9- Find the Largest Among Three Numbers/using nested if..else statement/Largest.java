



/*
  In this program, instead of checking for two conditions in a single if statement, we use nested if to find the greatest.

  Then, to find the largest, the following conditions are checked using if else statements

  If n1 is greater or equals to n2,
  and if n1 is greater or equals to n3, n1 is the greatest.
  else, n3 is the greatest.
  Else,
  if n2 is greater or equals to both n3, n2 is the greatest.
  else, n3 is the greatest.
  
  09-March-2023
*/


public class Largest {

    public static void main(String[] args) {

        double n1 = -4.5, n2 = 3.9, n3 = 5.5;

        if(n1 >= n2) {
            if(n1 >= n3)
                System.out.println(n1 + " is the largest number.");
            else
                System.out.println(n3 + " is the largest number.");
        } else {
            if(n2 >= n3)
                System.out.println(n2 + " is the largest number.");
            else
                System.out.println(n3 + " is the largest number.");
        }
    }
}

/*
Output

5.5 is the largest number.
*/
