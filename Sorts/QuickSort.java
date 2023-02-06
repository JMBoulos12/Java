



/*
  @author Varun Upadhyay (https://github.com/varunu28)
 * @author Podshivalov Nikita (https://github.com/nikitap492)
 * @see SortAlgorithm 
  
  06-February-2023
*/


package com.thealgorithms.sorts;

import static com.thealgorithms.sorts.SortUtils.*;

class QuickSort implements SortAlgorithm {
  
  @Override
  public <T extends Comparable<T>> T[] sort(T[] array) {
    doSort(array, 0, array.length - 1);
    return array;
  }

    /**
     * The sorting process
     *
     * @param left The first index of an array
     * @param right The last index of an array
     * @param array The array to be sorted
     */
  
  private static <T extends Comparable<T>> void doSort(
    T[] array,
    int left,
    int right
  ) {
    if (left < right) {
      int pivot = randomPartition(array, left, right);
      doSort(array, left, pivot - 1);
      doSort(array, pivot, right);
    }
  }
  /**
     * Ramdomize the array to avoid the basically ordered sequences
     *
     * @param array The array to be sorted
     * @param left The first index of an array
     * @param right The last index of an array
     * @return the partition index of the array
     */
  private static <T extends Comparable<T>> int randomPartition(
    T[] array,
    int left,
    int right
  ) {
    int randomIndex = left + (int) (Math.random() * (right - left + 1));
    swap(array, randomIndex, right);
    return partition(array, left, right);
  }
  /**
     * This method finds the partition index for an array
     *
     * @param array The array to be sorted
     * @param left The first index of an array
     * @param right The last index of an array Finds the partition index of an
     * array
     */
  private static <T extends Comparable<T>> int partition(
    T[] array,
    int left,
    int right
  ) {
    int mid = (left + right) >>> 1;
    T pivot = array[mid];
    
    while (left <= right) {
      while (less(array[left], pivot)) {
        ++left;
      }
      while (less(pivot, array[right])) {
        --right;
      }
      if (left <= right) {
        swap(array, left, right);
        ++left;
        --right;
      }
    }
    return left;
  }
}
