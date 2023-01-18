

/*
  Write a method that returns the number of nodes in a binary tree.
  18-January-2023
*/

public Integer getNumberOfNodes(TreeNode node) {
  if (node == null) {
    return 0;
  }
  return 1 + getNumberOfNodes(node.left()) + getNumberOfNodes(node.right());
}
