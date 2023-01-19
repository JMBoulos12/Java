


/*
  Create a function that takes three numbers — the width and height of a rectangle, and the radius of a circle. 
  And returns true if the rectangle can fit inside the circle, false if it can't.

  Examples :
  rectangleInCircle(8, 6, 5) ➞ true

  rectangleInCircle(5, 9, 5) ➞ false

  rectangleInCircle(4, 7, 4) ➞ false 

  19-January-2023
*/

public class Challenge {
  public static boolean rectangleInCircle(int w, int h, int r) {
    return (w*w+h*h) < (4*r*r);
  }
}
