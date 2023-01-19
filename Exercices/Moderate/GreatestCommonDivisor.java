

/*
  The Greatest Common Divisor of two positive integers is the largest integer that divides both without remainder.
  Write a method that returns the Greatest Common Divisor of p and q.
  19-January-2023
*/

public Integer gcd(Integer p, Integer q) {
  if (q == 0) {
    return p;
  }
  return gcd(q, p % q);
}
