
/*
  Write a method that returns the average of a list of integers.
  (Java 8 Lambdas and Streams)
  18-January-2023
*/

public Double average(List<Integer> list) {
  return list.stream()
  .mapToInt(i -> i)
  .average()
  .getAsDouble();
}
