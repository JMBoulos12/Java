

/*
  Write a method that checks if there is at least on pair of numbers which sum equals target.
  arr=[1, 3, 4] and target=5 result is true because the pair (1,4) sums to five.
  Two Sum (Pair with a Given Sum)
  19-January-2023
*/

public Boolean sumsToTarget(Integer[] arr, Integer target) {
  Map<Integer, Integer> numMap = new HashMap<>();
  for (int i = 0; i < arr.length; i++) {
    int complement = target - arr[i];
    if (numMap.containsKey(complement)) {
      return true;
    } else {
      numMap.put(arr[i], i);
    }
  }
  return false;
}
