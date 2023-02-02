



/*
  You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

  Find two lines that together with the x-axis form a container, such that the container contains the most water.
  Return the maximum amount of water a container can store.
  Notice that you may not slant the container.

  Example 1:
  
  Input: height = [1,8,6,2,5,4,8,3,7]
  Output: 49
  Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
  
  Example 2:
  Input: height = [1,1]
  Output: 1

  Constraints:

  n == height.length
  2 <= n <= 105
  0 <= height[i] <= 104
  
  02-February-2023
*/

class Solution {
  public int maxArea(int[] heights) {
    if (heights.length < 2) {
      return 0;
    }
    int maxArea = 0;
    int maxLeftHeight = 0;
    for (int i = 0; i < heights.length - 1; i++) {
      if (heights[i] <= maxLeftHeight) {
        continue;
      }
      maxLeftHeight = heights[i];
      int maxRightHeight = 0;
      for (int j = heights.length - 1; j > i; j--) {
        if (heights[j] <= maxRightHeight) {
          continue;
        }
        maxRightHeight = heights[j];
        final int area = (j - i) * Math.min(heights[i], heights[j]);
        if (area > maxArea) {
          maxArea = area;
        }
        if (heights[i] <= heights[j]) {
          break;
        }
      }
    }
    return maxArea;
  }
}
