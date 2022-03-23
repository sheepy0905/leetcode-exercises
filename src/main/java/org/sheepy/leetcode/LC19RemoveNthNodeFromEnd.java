package org.sheepy.leetcode;


public class LC19RemoveNthNodeFromEnd {

  public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode right = head;
    ListNode left = init(head, right, n);
    if (left == null) {
      return head.next;
    }
    while (right.next != null) {
      left = left.next;
      right = right.next;
    }
    left.next = left.next.next;

    return head;
  }

  public ListNode init(ListNode head, ListNode cur, int n) {
    if (n > 0) {
      if (cur != null) {
        cur = cur.next;
        return init(head, cur, --n);
      } else {
        return null;
      }
    } else {
      return head;
    }
  }

  static class ListNode {
    int val;
    ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, LC19RemoveNthNodeFromEnd.ListNode next) { this.val = val; this.next = next; }

    public int getVal() {
      return val;
    }

    public void setVal(int val) {
      this.val = val;
    }

    public ListNode getNext() {
      return next;
    }

    public void setNext(ListNode next) {
      this.next = next;
    }
  }
}
