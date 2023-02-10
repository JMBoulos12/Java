




/*
  Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the values in the list's nodes (i.e., 
  only nodes themselves may be changed.)
  Example 1:
  Input: head = [1,2,3,4]
  Output: [2,1,4,3]
  
  Example 2:
  Input: head = []
  Output: []
  
  Example 3:
  Input: head = [1]
  Output: [1]
  Constraints:
  The number of nodes in the list is in the range [0, 100].
  0 <= Node.val <= 100 
  10-February-2023
*/

class Solution {
 public:
  ListNode* swapPairs(ListNode* head) {
    const int length = getLength(head);
    ListNode dummy(0, head);
    ListNode* prev = &dummy;
    ListNode* curr = head;

    for (int i = 0; i < length / 2; ++i) {
      ListNode* next = curr->next;
      curr->next = next->next;
      next->next = prev->next;
      prev->next = next;
      prev = curr;
      curr = curr->next;
    }

    return dummy.next;
  }

 private:
  int getLength(ListNode* head) {
    int length = 0;
    for (ListNode* curr = head; curr; curr = curr->next)
      ++length;
    return length;
  }
};
