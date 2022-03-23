package org.sheepy.leetcode;


public class LC116PopulatingNextRightPointers {

  public Node connect(Node root) {
    if (root == null) {
      return null;
    }
    // traverse the tree by each height level
    Node start = root;
    while (start != null) {
      Node cur = start;
      while (cur != null) {
        if (cur.left != null) {
          cur.left.next = cur.right;
        }
        if (cur.right != null && cur.next != null) {
          cur.right.next = cur.next.left;
        } else {
          cur.right = null;
        }
        cur = cur.next;
      }

      start = start.left;
    }
    return root;
  }

  static class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
      val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
      val = _val;
      left = _left;
      right = _right;
      next = _next;
    }
  }
}
