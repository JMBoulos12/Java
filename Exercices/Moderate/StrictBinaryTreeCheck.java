

/*
  A binary tree is strict when all nodes have either two or zero child nodes.
  Write a method that checks if a binary tree is strict.
  TreeNode API methods: node.left() and node.right().
  19-January-2023
*/

public Boolean isStrictTree(TreeNode node) {
  if (node == null) {
    return true;
  }
  if ((node.left() == null && node.right() != null) || (node.left() != null && node.right() == null)) {
    return false;
  }
  return isStrictTree(node.left()) && isStrictTree(node.right());
}
