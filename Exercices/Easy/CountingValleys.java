




/*
  Our goal is to count the number of valleys. A valley is a sequence of steps starting with a step downward from sea level and ending with a step upward to sea level. 
  Let level be a variable denoting the current altitude. 
  If we take a step upwards, level is incremented by one; 
  if we take step downwards, level is decremented by one. 
  
  Since we know that the sequence of input steps starts and ends at sea level, then we can say that our level variable is 0 at the beginning and end of the hike. 
  The number of valleys can be counted as the number of steps taken upwards to sea level (i.e., when level goes from -1 to 0. 
  This is true, because each such step ends the sequence of steps below sea level, signifying the end of a valley.
  
  21-January-2023
*/

import java.util.*;

public class Solution {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    char[] hike = scan.next().toCharArray();
    int count = 0;
    int altitude = 0;
    for(char c : hike) {
      // Step up
      if(c == 'U') {
        if(altitude == -1) {
          count++;
        }
        altitude++;
      }
      // Step down
      else {
        altitude--;
      }
    }
    scan.close();
    System.out.println(count);
  }
}
