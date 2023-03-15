



/*
  Output

  GCD of 81 and 153 is 9
  Here, two numbers whose GCD are to be found are stored in n1 and n2 respectively.

  Then, a for loop is executed until i is less than both n1 and n2. 
  This way, all numbers between 1 and smallest of the two numbers are iterated to find the GCD.

  If both n1 and n2 are divisble by i, gcd is set to the number. 
  This goes on until it finds the largest number (GCD) which divides both n1 and n2 without remainder.

  15-March-2023
*/


class Main {
  public static void main(String[] args) {

    // find GCD between n1 and n2
    int n1 = 81, n2 = 153;
    
    // initially set to gcd
    int gcd = 1;

    for (int i = 1; i <= n1 && i <= n2; ++i) {

      // check if i perfectly divides both n1 and n2
      if (n1 % i == 0 && n2 % i == 0)
        gcd = i;
    }

    System.out.println("GCD of " + n1 +" and " + n2 + " is " + gcd);
  }
}
