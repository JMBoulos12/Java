

/*
  Write a method that returns the maximum depth of a binary tree. The maximum depth is the number of nodes from the root (inclusive) until the furthest node (inclusive).
  18-January-2023
*/

public Integer depthBinaryTree(TreeNode node) {
  if (node == null) {
    return 0;
  }
  return 1 + Math.max(depthBinaryTree(node.right()), depthBinaryTree(node.left()));
}
