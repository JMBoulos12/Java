


/*
  Given the shortest side of a 30° by 60° by 90° triangle, find out the other two sides. Return the longest side and medium-length side in that order.

  Examples  :
  otherSides(1) ➞ [2.0, 1.73]

  otherSides(12) ➞ [24.0, 20.0]

  otherSides(2) ➞ [4.0, 3.46]

  otherSides(3) ➞ [6.0, 5.2]
  
  Notes :
  30° by 60° by 90° triangles always follow this rule: let's say the shortest side length is x units, the hypotenuse would be 2x units and the other side would be x * square root of 3. 
  
  19-January-2023
*/

public class SideLengths {
  public static double[] otherSides(int n) {
    return new double[]{n*2.0, n*1.7};
  }
}
