




/*
  Given a positive number as a string, multiply the number by 11 and also return it as a string. However, there is a catch:

  You are NOT ALLOWED to simply cast the numeric string into an integer!

  Now, how is this challenge even possible? Despite this, there is still a way to solve it, and it involves thinking about how someone might multiply by 11 in their head. See the tips below for guidance.

  Examples  :
  multiplyBy11("11") ➞ "121"
  multiplyBy11("111111111") ➞ "1222222221"
  multiplyBy11("1213200020") ➞ "13345200220"
  multiplyBy11("1217197941") ➞ "13389177351"
  multiplyBy11("9473745364784876253253263723") ➞ "104211199012633638785785900953"
  
  Tip :
  There is a simple trick to multiplying any two-digit number by 11 in your head:

  1-  Add the two digits together
  2-  Place the sum between the two digits!
  3-  Note if the total goes over, carry the sum on to the next digit
  
  // 23 * 11
  // Add together 2 and 3 to make 5
  // Place 5 between the two digits to make 253
  
  // 77 * 11
  // Add together 7 and 7 to make 14
  // Place 4 between the two digits to make 747
  // Carry the 1 to make 847

  Notes :
  Check out this resource to find out how this process can be utilized for numbers of any length. 
  
  26-January-2023
*/

public class ElevenTimes {
  public static String multiplyBy11(String n, int...r) {
    int l=n.length();
    if (r.length<1) return multiplyBy11(n, 0) + n.charAt(l-1);
    int x=(l>0 ? Integer.parseInt(n.charAt(l-1)+"") : 0) + (l>1 ? Integer.parseInt(n.charAt(l-2)+"") : 0) + r[0];
    r[0]=x/10;
		x=x%10;
    return l==0 && r[0]==0 ? (x==0 ? "" : "" + x) :
    multiplyBy11(n.substring(0,l-1),r[0]) + x;
  }
}
