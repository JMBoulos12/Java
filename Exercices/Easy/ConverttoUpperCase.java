

/*
  Write a method that converts all strings in a list to their upper case.
  (Java 8 Lambdas and Streams)
  18-January-2023
*/

public List<String> upperCase(List<String> list) {
  
  return list.stream()
  .map(String::toUpperCase)
  .collect(Collectors.toList());
}
