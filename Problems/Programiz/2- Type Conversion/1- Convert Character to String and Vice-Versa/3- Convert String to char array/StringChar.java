



/*
  In this program, we have a string stored in the variable st. 
  We use String's toCharArray() method to convert the string to an array of characters stored in chars.

  We then, use Arrays's toString() method to print the elements of chars in an array-like form.
  
  We can also convert a string to char array (but not char) using String's method toCharArray().

  10-March-2023
*/


import java.util.Arrays;

public class StringChar {

    public static void main(String[] args) {
        String st = "This is great";

        char[] chars = st.toCharArray();
        System.out.println(Arrays.toString(chars));
    }
}

/*
Output  :
  [T, h, i, s,  , i, s,  , g, r, e, a, t]
*/
