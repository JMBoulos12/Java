




/*
  Create a function to generate all nonconsecutive binary strings where nonconsecutive is defined as a string where no consecutive ones are present, and where n governs the length of each binary string.

  Examples
  generateNonconsecutive(1) ➞ "0 1"

  generateNonconsecutive(2) ➞ "00 01 10"

  generateNonconsecutive(3) ➞ "000 001 010 100 101"

  generateNonconsecutive(4) ➞ "0000 0001 0010 0100 0101 1000 1001 1010" 
  
  23-January-2023
*/

public class NonConsecutiveBits {
  public static String generate(int n) {
    String ans = "";
    for(int i=0; i<Math.pow(2, n); i++){
      String b = String.valueOf(Integer.toBinaryString(i));
      while(b.length() < n) b = "0" + b;
      if(b.indexOf("11") < 0) ans += " " + b;
    }
    return ans.substring(1);
  }
}
