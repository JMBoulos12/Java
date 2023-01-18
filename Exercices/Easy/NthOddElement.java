

/*
  Write a method that returns the nth odd element of a list. If the index of the element exceeds the list size, then return -1.
  18-January-2023
*/

public Integer getElement(List<Integer> list, Integer n) {
  
  int elementIndex = 2 * (n-1);
  return elementIndex > list.size() - 1 ? -1 : list.get(elementIndex);
  
}
