



/*
  In this program, we've used the format() method to print the given floating-point number num to 4 decimal places.  
  The 4 decimal places are given by the format .4f.

  This means, print only up to 4 places after the dot (decimal places), and f means to print the floating-point number.

  10-March-2023
*/


public class Decimal {

    public static void main(String[] args) {
        double num = 1.34567;

        System.out.format("%.4f", num);
    }
}

/*
Output  :
1.3457
*/
