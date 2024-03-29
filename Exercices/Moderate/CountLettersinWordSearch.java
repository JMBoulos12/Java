


/*
  Create a function that counts the number of times a particular letter shows up in the word search.

  Examples  :
  letterCounter([
    ["D", "E", "Y", "H", "A", "D"],
    ["C", "B", "Z", "Y", "J", "K"],
    ["D", "B", "C", "A", "M", "N"],
    ["F", "G", "G", "R", "S", "R"],
    ["V", "X", "H", "A", "S", "S"]
  ], "D") ➞ 3

  // "D" shows up 3 times: twice in the first row, once in the third row.

  letterCounter([
    ["D", "E", "Y", "H", "A", "D"],
    ["C", "B", "Z", "Y", "J", "K"],
    ["D", "B", "C", "A", "M", "N"],
    ["F", "G", "G", "R", "S", "R"],
    ["V", "X", "H", "A", "S", "S"]
  ], "H") ➞ 2
  
  Notes :
  You will always be given an array with five sub-arrays.

  19-January-2023
*/

public class Program {
  public static int letterCounter(char[][] arr, char c) {
    int count = 0;
    for(char[] a: arr) {
      for (char b: a)
        if (b == c)
          count++;
    }
    return count;
  }
}
