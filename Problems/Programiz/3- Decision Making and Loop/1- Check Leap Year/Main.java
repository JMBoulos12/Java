



/*
  Output  :
  1900 is not a leap year.
  
  In the above example, we are checking if the year 1900 is a leap year or not. 
  Since 1900 is a century year (ending with 00), it should be divisible by both 4 and 400 to be a leap year.

  However, 1900 is not divisible by 400. Hence, it is not a leap year.

  Now, let's change the year to 2012. The output will be
  2012 is a leap year.
  
  Here, 2012 is not a century year. Hence, to be a leap year, it needs to be divisible by only 4.

  Since 2012 is divisible by 4, it is a leap year.

  14-March-2023
*/


public class Main {

  public static void main(String[] args) {

    // year to be checked
    int year = 1900;
    boolean leap = false;

    // if the year is divided by 4
    if (year % 4 == 0) {

      // if the year is century
      if (year % 100 == 0) {

        // if year is divided by 400
        // then it is a leap year
        if (year % 400 == 0)
          leap = true;
        else
          leap = false;
      }
      
      // if the year is not century
      else
        leap = true;
    }
    
    else
      leap = false;

    if (leap)
      System.out.println(year + " is a leap year.");
    else
      System.out.println(year + " is not a leap year.");
  }
}
