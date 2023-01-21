




/*
  A binary tree is perfect when all levels are complete.
  Write a method that checks if a binary tree is perfect.
  TreeNode API methods: node.left() and node.right(). 
  
  21-January-2023
*/

public Boolean isPerfectTree(TreeNode node) {
  int treeDepth = depth(node);
  return isPerfectTree(node, 1, treeDepth);
}
private int depth(TreeNode node) {
  return node.left() != null ? 1 + depth(node.left()) : 1;
}
private Boolean isPerfectTree(TreeNode node, int depth, int treeDepth) {
  // check for last level node
  if (depth == treeDepth && (node.left() == null && node.right() == null)) {
    return true;
  }
  // check for inner levels
  if ((node.left() != null && node.right() != null)) {
    return isPerfectTree(node.left(), 1 + depth, treeDepth) &&
      isPerfectTree(node.right(), 1 + depth, treeDepth);
  }
  return false;
}
