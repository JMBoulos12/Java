



/*
  Bogo sort uses 2 steps to sort elements of the array.
  1. It throws the number randomly.
  2. Check whether the number is sorted or not.
  3. If sorted then return the sorted array.
  4. Otherwise it again generate another randomization of the numbers until the array is sorted. 
  
  05-February-2023
*/


package com.jmboulos.sorts;

import java.util.Random;

public class BogoSort implements SortAlgorithm {
  
  private static final Random random = new Random();
  private static <T extends Comparable<T>> boolean isSorted(T[] array) {
    for (int i = 0; i < array.length - 1; i++) {
      if (SortUtils.less(array[i + 1], array[i])) {
        return false;
      }
    }
    return true;
  }
  
  // Randomly shuffles the array
  private static <T> void nextPermutation(T[] array) {
    int length = array.length;
    
    for (int i = 0; i < array.length; i++) {
      int randomIndex = i + random.nextInt(length - i);
      SortUtils.swap(array, randomIndex, i);
    }
  }
  
  public <T extends Comparable<T>> T[] sort(T[] array) {
    while (!isSorted(array)) {
      nextPermutation(array);
    }
    return array;
  }
  
  // Driver Program
  public static void main(String[] args) {
    // Integer Input
    Integer[] integers = { 4, 23, 6, 78, 1, 54, 231, 9, 12 };
    
    BogoSort bogoSort = new BogoSort();
    
    // print a sorted array
    SortUtils.print(bogoSort.sort(integers));
    
    // String Input
    String[] strings = { "c", "a", "e", "b", "d" };
    SortUtils.print(bogoSort.sort(strings));
  }
}
