




/*
  Package Rice Bags (part 2)
  
  Provided that you have a given number of small rice bags (1 kilo each) and big rice bags (5 kilos each). 
  Write a method that returns the minimum number of small bags necessary to package goal kilos of rice. 
  Return -1 if it is not possible to package the required rice amount with the bags provided. 
  
  21-January-2023
*/

public Integer getNumberSmallBags(Integer big, Integer small, Integer goal) {
  int result = -1;
  if (big * 5 >= goal) {
    if (small >= goal % 5)
      result = goal % 5;
  } else {
    if (small >= goal - big * 5) {
      result = goal - big * 5;
    }
  }
  return result;
}
