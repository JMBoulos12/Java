



/*
  Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

  Example 1:
  Input: n = 3
  Output: ["((()))","(()())","(())()","()(())","()()()"]
  
  Example 2:
  Input: n = 1
  Output: ["()"]

  Constraints:
  1 <= n <= 8 

  07-February-2023
*/

class Solution {
  public List<String> generateParenthesis(int n) {
    List<String> ans = new ArrayList<>();

    dfs(n, n, new StringBuilder(), ans);
    return ans;
  }

  private void dfs(int l, int r, final StringBuilder sb, List<String> ans) {
    if (l == 0 && r == 0) {
      ans.add(sb.toString());
      return;
    }

    if (l > 0) {
      sb.append("(");
      dfs(l - 1, r, sb, ans);
      sb.deleteCharAt(sb.length() - 1);
    }
    if (l < r) {
      sb.append(")");
      dfs(l, r - 1, sb, ans);
      sb.deleteCharAt(sb.length() - 1);
    }
  }
}
