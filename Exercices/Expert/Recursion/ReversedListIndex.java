




/*
  Write a recursive function that filters the items in an array (given as parameter arr) by positional parity (odd or even), given as parameter par, starting from the opposite end. 
  Return an array of items on odd positions (... 5, 3, 1) or on even positions (... 6, 4, 2) and counting from the last item in the array.

  Examples  :
  getItemsAt([2, 4, 6, 8, 10], "odd") ➞ [2, 6, 10]
  // 2, 6 & 10 occupy the 5th, 3rd and 1st positions from right.
  // Odd positions, hence the parity, and from the opposite.

  getItemsAt(['E', 'D', 'A', 'B', 'I', 'T'], "even") ➞ ['E', 'A', 'I']
  // E, A and I occupy the 6th, 4th and 2nd positions from right.
  // Even positions, hence the parity, and from the opposite.

  getItemsAt([")", "(", "*", "&", "^", "%", "$", "#", "@", "!"]) ➞ [")", "*", ^", "$", "@"]

  getItemsAt(["A", "R", "B", "I", "T", "R", "A", "R", "I", "L", "Y"], "even") ➞ ["R", "I", "R", "R", "L"]
  
  Notes :
  * IMPORTANT: You are advised to solve this challenge via a recursive approach, hence, the very purpose of this challenge. 
    You can check the Resources tab about a few topics on recursion.
  * Arrays are zero-indexed, so, index+1 = position or position-1 = index.
  * Items in the array may contain duplicates. See example #4.
  * The last item in the array is always the first item to start a positional count.
  * The sequence of the items in the resulting array should be retained (i.e. Example #1 - 6 should come after 2 and before 10, 
    Example #2 - 'A' should come after 'E' and before 'I'). 

  26-January-2023
*/

public class ReversedListIndex {
  public static Object[] getItemsAt(Object[] arr, String par) {
    int idx = arr.length-1;
    if(!par.equals("odd")) idx--;
    Object[] v = new Object[0];
    return getItem(arr, idx, v);
  }
  public static Object[] getItem(Object[] arr, int idx, Object[] v) {
    if (idx < 0) return v;
    Object[] w = new Object[v.length+1];
    w[0] = arr[idx];
    for (int i = 0; i < v.length; i++) w[i+1] = v[i];
    return getItem(arr, idx-2, w);
  }
}
