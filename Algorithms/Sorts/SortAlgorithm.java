



/*
  The common interface of most sorting algorithms 
  
  06-February-2023
*/

package com.jmboulos.sorts;

import java.util.Arrays;
import java.util.List;

public interface SortAlgorithm {
    /**
     * Main method arrays sorting algorithms
     *
     * @param unsorted - an array should be sorted
     * @return a sorted array
     */
  <T extends Comparable<T>> T[] sort(T[] unsorted);

    /**
     * Auxiliary method for algorithms what wanted to work with lists from JCF
     *
     * @param unsorted - a list should be sorted
     * @return a sorted list
     */
  @SuppressWarnings("unchecked")
  default <T extends Comparable<T>> List<T> sort(List<T> unsorted) {
    return Arrays.asList(
      sort(unsorted.toArray((T[]) new Comparable[unsorted.size()]))
    );
  }
}