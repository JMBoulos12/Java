


/*
  Given an n-sided regular polygon n, return the total sum of internal angles (in degrees).

  Examples
  sumOfAngles(3) ➞ 180

  sumOfAngles(4) ➞ 360

  sumOfAngles(6) ➞ 720
  Notes
  n will always be greater than 2.
  The formula (n - 2) x 180 gives the sum of all the measures of the angles of an n-sided polygon.
  
  19-January-2023
*/

public class Polygon { 
  public static int sumOfAngles(int n) {
    return 180 * (n - 2);
  }
}
