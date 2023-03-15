



/*
  Output  :
  GCD: 9
  
  This is a better way to find the GCD. In this method, smaller integer is subtracted from the larger integer, 
  and the result is assigned to the variable holding larger integer. 
  This process is continued until n1 and n2 are equal.

  The above two programs works as intended only if the user enters positive integers. 
  Here's a little modification of the second example to find the GCD for both positive and negative integers.

  15-March-2023
*/


class Main {
  public static void main(String[] args) {

    // find GCD between n1 and n2
    int n1 = 81, n2 = 153;
    
    while(n1 != n2) {
    
      if(n1 > n2) {
        n1 -= n2;
      }
      
      else {
        n2 -= n1;
      }
    }

    System.out.println("GCD: " + n1);
  }
}
