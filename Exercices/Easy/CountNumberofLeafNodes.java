

/*
  Count the number of leaf nodes in a binary tree
  18-January-2023
*/

public Integer countLeafNodes(TreeNode node) {
  if (node == null) {
    return 0;
  }
  if (node.left() == null && node.right() == null) {
    return 1;
  }
  return countLeafNodes(node.left()) + countLeafNodes(node.right());
}
