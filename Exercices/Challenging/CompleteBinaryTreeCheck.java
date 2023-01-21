




/*
  A binary tree is complete when all levels apart from the last are filled and all leaf nodes in the last level are aligned to the left.
  Write a method that checks if a binary tree is complete.
  TreeNode API methods: node.left() and node.right(). 
  21-January-2023
*/

public Boolean isCompleteTree(TreeNode node) {
  int numberNodes = countNodes(node);
  return isComplete(node, 0, numberNodes);
}
private Boolean isComplete(TreeNode node, int index, int numberNodes) {
  if (node == null)
    return true;
  if (index > numberNodes)
    return false;
  else return isComplete(node.left(), 2 * index + 1, numberNodes) &&
    isComplete(node.right(), 2 * index + 2, numberNodes);
}
private Integer countNodes(TreeNode node) {
  if (node == null) {
    return 0;
  }
  else return 1 + countNodes(node.left()) + countNodes(node.right());
