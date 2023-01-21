




/*
  Given the fixed small size of the problem, brute force is fine.

  Points to note:-

  Negative values possible.
  Maximum sum can be less than zero.
  Range of element value is -9 to 9.
  Numbers to be summed for each hourglass = 7.
  Minimum possible value for sum = 7*(-9) = -63.
  So we'll initialize our maxSum to -63. From there, we just calculate the sums of all hourglasses and return the maxSum. 

  21-January-2023
*/

public static int hourglassSum(List<List<Integer>> arr) {
        TreeSet<Integer> set = new TreeSet<>();
        IntStream.range(0, 4).forEach(lineNumber -> {
                    int firstLine = lineNumber;
                    int secondLine = lineNumber + 1;
                    int thirdLine = lineNumber + 2;

                    IntStream.range(1, 5).forEach(columnNumber -> {
                        int firstColumn = columnNumber - 1;

                        int sum = arr.get(firstLine)
                            .subList(firstColumn, firstColumn + 3)
                            .stream()
                            .mapToInt(Integer::intValue)
                            .sum();
                            
                        sum += arr.get(secondLine).get(columnNumber);
                        sum += arr.get(thirdLine)
                            .subList(firstColumn, firstColumn + 3)
                            .stream()
                            .mapToInt(Integer::intValue)
                            .sum();

                        set.add(sum);
                    });
                }
        );
        return set.last();

    }
