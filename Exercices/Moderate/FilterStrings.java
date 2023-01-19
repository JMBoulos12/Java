

/*
  Given a list of strings, write a method that returns a list of all strings that start with the letter 'a' (lower case) and have exactly 3 letters.
  TIP: Use Java 8 Lambdas and Streams API's.
  (Java 8 Lambdas and Streams)
  19-January-2023
*/

public List<String> search(List<String> list) {
  return list.stream()
    .filter(s -> s.startsWith("a"))
    .filter(s -> s.length() == 3)
    .collect(Collectors.toList());
}
