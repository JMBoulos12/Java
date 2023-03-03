



/*
  Bubble sort, sometimes referred to as sinking sort, is a simple sorting algorithm that repeatedly steps through the list to be sorted, compares each pair of adjacent items and swaps them if they are in the wrong order. 
  The pass through the list is repeated until no swaps are needed, which indicates that the list is sorted. 
  
  05-February-2023
*/

package com.java.sorts;

import static com.java.sorts.SortUtils.*;

class BubbleSort implements SortAlgorithm {
  
  @Override
  public <T extends Comparable<T>> T[] sort(T[] array) {
    for (int i = 1, size = array.length; i < size; ++i) {
      boolean swapped = false;
      for (int j = 0; j < size - i; ++j) {
        if (greater(array[j], array[j + 1])) {
          swap(array, j, j + 1);
          swapped = true;
        }
      }
      if (!swapped) {
        break;
      }
    }
    return array;
  }
}
