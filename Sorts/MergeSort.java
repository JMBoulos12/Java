



/*
  Generic merge sort algorithm.
  
  06-February-2023
*/

package com.thealgorithms.sorts;

import static com.thealgorithms.sorts.SortUtils.less;

class MergeSort implements SortAlgorithm {
  
  @SuppressWarnings("rawtypes")
  private static Comparable[] aux;
  
  @Override
  public <T extends Comparable<T>> T[] sort(T[] unsorted) {
    aux = new Comparable[unsorted.length];
    doSort(unsorted, 0, unsorted.length - 1);
    return unsorted;
  }
  
  /**
   * @param arr the array to be sorted.
   * @param left the first index of the array.
   * @param right the last index of the array.
   */
  private static <T extends Comparable<T>> void doSort(T[] arr, int left, int right) {
    if (left < right) {
      int mid = (left + right) >>> 1;
      doSort(arr, left, mid);
      doSort(arr, mid + 1, right);
      merge(arr, left, mid, right);
    }
  }
  /**
   * Merges two parts of an array.
   *
   * @param arr the array to be merged.
   * @param left the first index of the array.
   * @param mid the middle index of the array.
   * @param right the last index of the array merges two parts of an array in
   * increasing order.
   */
  @SuppressWarnings("unchecked")
  private static <T extends Comparable<T>> void merge(T[] arr, int left, int mid, int right) {
    int i = left, j = mid + 1;
    System.arraycopy(arr, left, aux, left, right + 1 - left);
    
    for (int k = left; k <= right; k++) {
      if (j > right) {
        arr[k] = (T) aux[i++];
      } else if (i > mid) {
        arr[k] = (T) aux[j++];
      } else if (less(aux[j], aux[i])) {
        arr[k] = (T) aux[j++];
      } else {
        arr[k] = (T) aux[i++];
      }
    }
  }
}
