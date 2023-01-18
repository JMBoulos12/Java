

/*
  Count the number of nodes in a list.
  ListNode API methods: node.next().
  18-January-2023
*/

public Integer count(ListNode node) {
  int count = 0;
  ListNode current = node;
  while (current != null) {
    count++;
    current = current.next();
  }
  return count;
}
