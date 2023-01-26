




/*
  Write a function that, given the startOfRange and endOfRange values, returns an array containing all the numbers inclusive to that range. See examples below.

  Examples  :
  reversibleInclusiveList(1, 5) ➞ [1, 2, 3, 4, 5]
  reversibleInclusiveList(2, 8) ➞ [2, 3, 4, 5, 6, 7, 8]
  reversibleInclusiveList(10, 20) ➞ [10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
  reversibleInclusiveList(24, 17) ➞ [24, 23, 22, 21, 20, 19, 18, 17]
  
  IMPORTANT :
  The use of IntStream.range and IntStream.rangeClosed is totally unacceptable, hence, recursion is the very purpose of this challenge.
  
  Notes :
  * The sort order of the resulting array is dependent of the input values.
  * All inputs provided in the test scenarios are valid.
  * If startOfRange is greater than endOfRange, return an descendingly sorted array, otherwise, ascendingly sorted.
  * You are expected to solve this challenge via a recursive approach. 
  
  26-January-2023
*/


public class ReversibleListRanges {
  public static int[] reversibleInclusiveList(int s, int e, int...a) {
    int[] r=new int[1];
    if (a.length>0) {
      r=new int[a.length+1];
      System.arraycopy(a, 0, r, 0, a.length);
    }
    r[r.length-1]=s;
    return s==e ? r : reversibleInclusiveList(s<e ? ++s : --s, e, r);
  }
}
