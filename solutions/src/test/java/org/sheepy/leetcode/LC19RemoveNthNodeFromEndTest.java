package org.sheepy.leetcode;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.sheepy.leetcode.LC19RemoveNthNodeFromEnd.ListNode;

class LC19RemoveNthNodeFromEndTest {

  private LC19RemoveNthNodeFromEnd solution;

  @BeforeEach
  void setUp() {
    solution = new LC19RemoveNthNodeFromEnd();
  }

  @Test
  void removeNthFromEnd() {
    ListNode head = initialize(Arrays.asList(1, 2, 3, 4, 5));
    ListNode ret = solution.removeNthFromEnd(head, 5);
  }

  private ListNode initialize(List<Integer> list) {
    ListNode head = new ListNode();
    ListNode cur = head;
    for (Integer val : list) {
      cur.setVal(val);
      cur.setNext(new ListNode());
      cur = cur.getNext();
    }
    cur.next = null;
    return head;
  }
}