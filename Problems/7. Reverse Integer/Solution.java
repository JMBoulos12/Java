



/*
  Given a signed 32-bit integer x, return x with its digits reversed. 
  If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

  Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

  Example 1:
  Input: x = 123
  Output: 321
  
  Example 2:
  Input: x = -123
  Output: -321
  
  Example 3:
  Input: x = 120
  Output: 21

  Constraints:
  -231 <= x <= 231 - 1 
  
  31-January-2023
*/


 public int reverse(int x) {
   String ans = x < 0 ? new StringBuilder(String.valueOf(-x)).append("-").reverse().toString()
     : new StringBuilder(String.valueOf(x)).reverse().toString();
   try {
     return Integer.parseInt(ans);
   } catch (Exception e) {
     return 0;
   }
 }
