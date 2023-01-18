
/*
  Write a method that returns the largest integer in the list.
  You can assume that the list has at least one element.
  18-January-2023
*/

public Integer maximum(Integer[] list) {
  
  int maximum = list[0];
  for (int i : list) {
    if (i > maximum) {
      maximum = i;
    }
  }
  return maximum;
}
