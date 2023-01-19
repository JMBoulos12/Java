

/*
  A prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself.
  Write a method that checks if a number is a prime number.
  19-January-2023
*/

public Boolean isPrime(Integer n) {
  boolean isPrime = true;
  for (int i = n - 1; i > 1; i--) {
    if (n % i == 0) {
      isPrime = false;
      break;
    }
  }
  return isPrime;
}
