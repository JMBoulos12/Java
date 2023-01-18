

/*
  Find the second largest number in an integer array. You can assume a minimum array length of two.
  18-January-2023
*/

public Integer find(Integer[] arr) {
  
  int max = Integer.MIN_VALUE;
  int secondMax = Integer.MIN_VALUE;
  
  for (int i = 0; i < arr.length; i++) {
    if (arr[i] > max) {
      secondMax = max;
      max = arr[i];
    }
    if (arr[i] < max && arr[i] > secondMax) {
      secondMax = arr[i];
    }
  }
  return secondMax;
}
