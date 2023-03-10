



/*
  In this program, we've used DecimalFormat class to round a given number num.

  We declare the format using the # patterns #.###. This means we want num up to 3 decimal places. 
  We also set the rounding mode to Ceiling, this causes the last given place to be rounded to its next number.

  So, 1.34567 rounded to 3 decimal places prints 1.346, 6 is the next number for 3rd place decimal 5.

  10-March-2023
*/


import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Decimal {

    public static void main(String[] args) {
        double num = 1.34567;
        DecimalFormat df = new DecimalFormat("#.###");
        df.setRoundingMode(RoundingMode.CEILING);

        System.out.println(df.format(num));
    }
}

/*
Output  :
1.346
*/
