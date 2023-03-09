



/*
  In this program, the coefficients a, b, and c are set to 2.3, 4, and 5.6 respectively. Then, the determinant is calculated as b2 - 4ac.

  Based on the value of the determinant, the roots are calculated as given in the formula above. 
  Notice we've used library function Math.sqrt() to calculate the square root of a number.

  We have used the format() method to print the calculated roots.

  The format() function can also be replaced by printf() as:

  System.out.printf("root1 = root2 = %.2f;", root1);

  09-March-2023
*/


public class Main {

  public static void main(String[] args) {

    // value a, b, and c
    double a = 2.3, b = 4, c = 5.6;
    double root1, root2;

    // calculate the determinant (b2 - 4ac)
    double determinant = b * b - 4 * a * c;

    // check if determinant is greater than 0
    if (determinant > 0) {

      // two real and distinct roots
      root1 = (-b + Math.sqrt(determinant)) / (2 * a);
      root2 = (-b - Math.sqrt(determinant)) / (2 * a);

      System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
    }

    // check if determinant is equal to 0
    else if (determinant == 0) {

      // two real and equal roots
      // determinant is equal to 0
      // so -b + 0 == -b
      root1 = root2 = -b / (2 * a);
      System.out.format("root1 = root2 = %.2f;", root1);
    }

    // if determinant is less than zero
    else {

      // roots are complex number and distinct
      double real = -b / (2 * a);
      double imaginary = Math.sqrt(-determinant) / (2 * a);
      System.out.format("root1 = %.2f+%.2fi", real, imaginary);
      System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
    }
  }
}

/* 
Output  :
root1 = -0.87+1.30i and root2 = -0.87-1.30i
*/
