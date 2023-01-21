




/*
  The prime factors of 455 are 5, 7 and 13.
  Write a method that calculates the largest prime factor of a given number. 
  
  21-January-2023
*/

public Integer largestPrimeFactor(Integer n) {
  int factor = -1;
  for (int i = 2; i * i <= n; i++) {
    if (n == 1) { break; }
    if (n % i != 0) { continue; }
    factor = i;
    while (n % i == 0) {
      n /= i;
    }
  }
  return n == 1 ? factor : n;
}
